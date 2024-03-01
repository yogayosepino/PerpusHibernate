<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% response.setHeader("Pragma", "No-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "no-cache");%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Cp1252"/>
<title>Anggota Form</title>
   <!--Calendar-->
<script language="javascript" type="text/javascript" src="<html:rewrite page="/js/date.js"/>"></script><!--buat perhitungan tanggal-->
<script language="javascript" type="text/javascript" src="<html:rewrite page="/js/hitung.js"/>"></script><!--buat tampilan-->
<script language="javascript" type="text/javascript" src="<html:rewrite page="/js/dhtmlgoodies_calendar.js"/>"></script><!--buat calender-->
<link type="text/css" rel="stylesheet" href="<html:rewrite page="/js/dhtmlgoodies_calendar.css"/>" media="screen"></link>
<script language="javascript" type="text/javascript" src="<html:rewrite page="/js/Ajax.js"/>"></script><!--buat AJAX-->



</head>
<body bgcolor="#D3D3D3">

    
   <center> 
   <h1>Anggota Form</h1>
   </center>
  <tr valign="top"><td>&nbsp;</td></tr>
      <tr valign="top"><td></td></tr>
<body>
	<html:form action = "/anggota/save">
	<html:hidden property="id"/>
 	<br/>
        <center>                    
                <table width="50%" border="3" cellspacing="0" cellpadding="0">
                            
					<tr>
						<td align="left">Kode Anggota</td>
						<td align="left">: &nbsp;</td>
						<td align="left"><html:text name="AnggotaForm" property="kode" size="32" styleClass="textbox"/></td>
								
					</tr>
					<tr>
						<td align="left">Nama Anggota</td>
						<td align="left">: &nbsp;</td>
						<td align="left"><html:text name="AnggotaForm" property="nama" size="32" styleClass="textbox"/>
						</td>
					</tr>
					<tr>
						<td align="left">Tanggal Gabung</td>
						<td align="left">: &nbsp;</td>
						<td align="left"><html:text property="tglGabung" size="12" readonly="true" styleClass="selectBox"/>&nbsp;
						<html:img page="/images/cal.gif" border="0" title="Calendar" onclick="displayCalendar(document.forms[0].tglGabung,'dd/mm/yyyy',this)"/>&nbsp;(dd/MM/yyyy)
						</td>
					</tr>
								
				</table>
				<br>
					
					<input class = "button" type="button" onclick="doBack()" value="Kembali" />
					<html:submit styleClass="button" onclick="return valid();" value="Simpan"/>
				</center>
			<br>
			</html:form>
	</body>
</html>

<script language="javascript">
function valid(){
	if(document.forms[0].nama.value==""){
		alert('Nama is required');
		return false;
	}
	if(document.forms[0].kode.value==""){
		alert('Kode is required');
		return false;
	}
	if(document.forms[0].tglGabung.value=="") {
		alert('Tanggal Gabung is required');
		return false;
	}
}
 function doBack()
 {			
    	document.forms[0].action = "<html:rewrite page="/anggota/list.do" />";
		document.forms[0].submit();
    }
</script>
