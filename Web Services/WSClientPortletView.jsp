<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="/WEB-INF/tld/portlet.tld" prefix="portletAPI"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://www.ibm.com/jsf/html_extended" prefix="hx"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<portletAPI:init />
<LINK rel="stylesheet" type="text/css"
	href='<%= response.encodeURL("/theme/stylesheet.css") %>' title="Style">
<f:view>
	<%-- jsf:pagecode language="java" location="/JavaSource/pagecode/WSClientPortletView.java" --%><%-- /jsf:pagecode --%>
	<P>Place content here.</P>
	<hx:scriptCollector id="scriptCollector1">
		<h:form styleClass="form" id="form1">
			<TABLE>
				<TBODY>
					<TR>
						<TD align="left">NumDigits:</TD>
						<TD style="width:5px">&nbsp;</TD>
						<TD><h:inputText id="text1"
							value="#{pc_WSClientPortletView.primesproxyGetPrimeParamBean.numDigits}"
							styleClass="inputText">
						</h:inputText></TD>
					</TR>
				</TBODY>
			</TABLE>
			<h:messages styleClass="messages" id="messages1"></h:messages>
			<BR>
			<hx:commandExButton id="button1" styleClass="commandExButton"
				type="submit" value="Submit"
				action="#{pc_WSClientPortletView.doPrimesproxyGetPrimeAction}">
			</hx:commandExButton>
			<TABLE>
				<TBODY>
					<TR>
						<TD align="left">PrimesProxyGetPrimeResultBean:</TD>
						<TD style="width:5px">&nbsp;</TD>
						<TD><h:outputText id="text2"
							value="#{pc_WSClientPortletView.primesproxyGetPrimeResultBean}"
							styleClass="outputText">
						</h:outputText></TD>
					</TR>
				</TBODY>
			</TABLE>
		</h:form>
	</hx:scriptCollector>
</f:view>