/*
 * Created on Mar 17, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package pagecode;

import com.itso.PrimesProxy;
import java.lang.String;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import com.ibm.faces.component.html.HtmlScriptCollector;
import javax.faces.component.html.HtmlMessages;
import com.ibm.faces.component.html.HtmlCommandExButton;
/**
 * @author admin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class WSClientPortletView extends PageCodeBase {

	protected PrimesProxy primesproxy;
	protected PrimesproxyGetPrimeParamBean primesproxyGetPrimeParamBean;
	protected String primesproxyGetPrimeResultBean;
	protected HtmlForm form1;
	protected HtmlInputText text1;
	protected HtmlOutputText text2;
	protected HtmlScriptCollector scriptCollector1;
	protected HtmlMessages messages1;
	protected HtmlCommandExButton button1;
	/** 
	 * @paramBean id=1
	 */
	public PrimesproxyGetPrimeParamBean getPrimesproxyGetPrimeParamBean() {
		if (primesproxyGetPrimeParamBean == null) {
			primesproxyGetPrimeParamBean = new PrimesproxyGetPrimeParamBean();
		}
		return primesproxyGetPrimeParamBean;
	}
	/** 
	 * @resultBean id=1
	 */
	public String getPrimesproxyGetPrimeResultBean() {
		return primesproxyGetPrimeResultBean;
	}
	/** 
	 * @action id=1
	 */
	public String doPrimesproxyGetPrimeAction() {
		try {
			primesproxyGetPrimeResultBean = getPrimesproxy().getPrime(
					getPrimesproxyGetPrimeParamBean().getNumDigits());
		} catch (Exception e) {
			logException(e);
		}
		return null;
	}
	/** 
	 * @methodEntry id=getPrime(int)/paramBean=1/resultBean=1/action=1
	 */
	public com.itso.PrimesProxy getPrimesproxy() {
		if (primesproxy == null) {
			primesproxy = new com.itso.PrimesProxy();
		}
		return primesproxy;
	}
	public void setPrimesproxy(PrimesProxy primesproxy) {
		this.primesproxy = primesproxy;
	}
	protected HtmlForm getForm1() {
		if (form1 == null) {
			form1 = (HtmlForm) findComponentInRoot("form1");
		}
		return form1;
	}
	protected HtmlInputText getText1() {
		if (text1 == null) {
			text1 = (HtmlInputText) findComponentInRoot("text1");
		}
		return text1;
	}
	protected HtmlOutputText getText2() {
		if (text2 == null) {
			text2 = (HtmlOutputText) findComponentInRoot("text2");
		}
		return text2;
	}
	protected HtmlScriptCollector getScriptCollector1() {
		if (scriptCollector1 == null) {
			scriptCollector1 = (HtmlScriptCollector) findComponentInRoot("scriptCollector1");
		}
		return scriptCollector1;
	}
	protected HtmlMessages getMessages1() {
		if (messages1 == null) {
			messages1 = (HtmlMessages) findComponentInRoot("messages1");
		}
		return messages1;
	}
	protected HtmlCommandExButton getButton1() {
		if (button1 == null) {
			button1 = (HtmlCommandExButton) findComponentInRoot("button1");
		}
		return button1;
	}
}