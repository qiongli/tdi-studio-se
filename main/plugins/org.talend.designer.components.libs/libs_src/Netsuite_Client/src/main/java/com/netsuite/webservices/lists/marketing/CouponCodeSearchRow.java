
package com.netsuite.webservices.lists.marketing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.CouponCodeSearchRowBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for CouponCodeSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponCodeSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}CouponCodeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponCodeSearchRow", propOrder = {
    "basic",
    "userJoin"
})
public class CouponCodeSearchRow
    extends SearchRow
{

    protected CouponCodeSearchRowBasic basic;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link CouponCodeSearchRowBasic }
     *     
     */
    public CouponCodeSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponCodeSearchRowBasic }
     *     
     */
    public void setBasic(CouponCodeSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

}
