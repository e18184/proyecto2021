<!DOCTYPE html>
<html>
	<head>
		<title>Pagina Principal</title>
	</head>
	<body>
		<table border="0" align="center">
			<tr>
				<td>
                                    
                                   <img src="images/banner.jpg">
                                    <iframe name="top" src="${pageContext.request.contextPath}/top.htm" ></iframe>
                                </td>
			</tr>
			<tr>
				<td>
					<table width="200%">
						<tr valign="top">
							<td width="200" background="images/bg2.jpg">
								<iframe id="principal" name="principal" src="${pageContext.request.contextPath}/principal_2.htm" witdh="30%" height="700"></iframe>
							</td>
							<td >
                                                            <iframe id="bottom" name="bottom" src="${pageContext.request.contextPath}/bottom.htm" height="700" width="850"></iframe>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr background="images/bg1.jpg">
				<td align="center">sin datos</td>
			</tr>
		</table>
	</body>
</html>