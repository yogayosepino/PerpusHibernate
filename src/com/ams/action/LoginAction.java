package com.ams.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.criterion.Restrictions;

import com.ams.form.LoginForm;
import com.ams.model.Login;
import com.ams.model.User;
import com.ams.model.dao.LoginDAO;
import com.ams.model.dao.UserDAO;

public class LoginAction extends Action {

	
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)
			throws Exception {
		ActionForward forward = null;
		String action = mapping.getParameter();
		if ("".equalsIgnoreCase(action)) {
			forward = mapping.findForward("home");
		}else if ("PERFORMLOGIN".equalsIgnoreCase(action)){
			forward = performLogin(mapping, form, request, response);
		}
		return forward;
	}
	public ActionForward performLogin(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response){
		LoginForm form = (LoginForm) actionForm;
		
//		buat dulu login hbm & form nya 
		
		try{
			if (form.getLong("id") > 0){
				Login login = (Login)LoginDAO.getInstance().getSession().createCriteria(Login.class).add(Restrictions.eq("Id", form.getLong("id"))).uniqueResult();
				form.setString("id", login.getId());
				form.setString("username", login.getUsername());
				form.setString("password", login.getPassword());
				request.setAttribute("login", login);
			}	
				
		}catch(Exception ex) {
		}finally {
			try {
				LoginDAO.getInstance().closeSessionForReal();
			}catch(Exception exx) {
			}
		}
		return mapping.findForward("success");
	}

}
