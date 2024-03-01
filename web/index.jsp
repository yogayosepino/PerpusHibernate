<%@ page contentType="text/html;charset=iso-8859-1" language="java" %>
<% response.setHeader("Pragma", "No-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "no-cache");%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title><bean:message key="page.index.title"/></title>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body style="margin:0px;">
<H3 align="center">MENU PERPUSTAKAAN</H3>
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
    	<td height="500" bgcolor="#D3D3D3" align="center" valign="middle">
	    	<logic:messagesNotPresent>
				<a href="/PerpusHibernate/anggota/list.do"> <bean:message key="page.anggota.title"/></a>
			</logic:messagesNotPresent>
			
			<logic:messagesNotPresent>
				<a href="/PerpusHibernate/kategori/list.do"><bean:message key="page.kategoriBuku.title"/></a>
			</logic:messagesNotPresent>
			<logic:messagesNotPresent>
				<a href="/PerpusHibernate/buku/list.do"><bean:message key="page.buku.title"/></a>
			</logic:messagesNotPresent>
			
			<logic:messagesPresent>
				<html:errors/>
			</logic:messagesPresent>
			
    	</td>
    	
  	</tr>
</table>
</body>

</html>