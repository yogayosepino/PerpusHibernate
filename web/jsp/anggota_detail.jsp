<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.ams.model.dao.AnggotaDAO"%>


<html>
	<title>.::Detail ::.</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

</head>

<body bgcolor="#D3D3D3">
<h1> Anggota Detail </h1>
<br/>
   
	
		<html:form action="anggota/detail">
		
		

			<center>
	
    		<table width="100%" border="1" cellspacing="0" cellpadding="0">
       
    			<tr>			
    				<td  bgcolor="#FFB90F"  align="center"><b>Nama Anggota</b></td>
    				<td  bgcolor="#FFB90F"  align="center"><b>Kode Anggota</b></td>
    				<td  bgcolor="#FFB90F"  align="center"><b>Tanggal Gabung Anggota</b></td>
    			
				</tr>
				
				<tr>
						<td align="center"><bean:write name="anggota" property="nama" scope="request"/></td>						
						<td align="center"><bean:write name="anggota" property="kode" scope="request"/></td>
						<td align="center"><bean:write name="anggota" property="formatedTglGabung" scope="request"/></td>
					
				</tr>
			</table>  
			</center>		
		
			<br/>
			
			
			<center>
				<input type="button" onclick="doback()" value="Kembali" />
			</center>
			</html:form>
		</body>
		
<script type="text/javascript">
function doback(){
			window.location.href = ('<html:rewrite page="/anggota/list.do" />')
	}
</script>
</html>
