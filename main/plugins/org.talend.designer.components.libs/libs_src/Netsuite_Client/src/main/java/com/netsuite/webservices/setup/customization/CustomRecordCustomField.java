
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.RecordRef;
import com.netsuite.webservices.setup.customization.types.CustomizationAccessLevel;
import com.netsuite.webservices.setup.customization.types.CustomizationDisplayType;
import com.netsuite.webservices.setup.customization.types.CustomizationDynamicDefault;
import com.netsuite.webservices.setup.customization.types.CustomizationSearchLevel;


/**
 * <p>Java class for CustomRecordCustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomFieldType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectRecordType" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showInList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="globalSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insertBefore" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subtab" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="displayType" type="{urn:types.customization_2014_2.setup.webservices.netsuite.com}CustomizationDisplayType" minOccurs="0"/>
 *         &lt;element name="displayWidth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="displayHeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="help" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentSubtab" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="linkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="checkSpelling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="defaultChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFormula" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultSelection" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="dynamicDefault" type="{urn:types.customization_2014_2.setup.webservices.netsuite.com}CustomizationDynamicDefault" minOccurs="0"/>
 *         &lt;element name="searchDefault" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="searchCompareField" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceList" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceFrom" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourcefilterby" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="recType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleRestrict" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomRecordCustomFieldFilterList" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{urn:types.customization_2014_2.setup.webservices.netsuite.com}CustomizationAccessLevel" minOccurs="0"/>
 *         &lt;element name="searchLevel" type="{urn:types.customization_2014_2.setup.webservices.netsuite.com}CustomizationSearchLevel" minOccurs="0"/>
 *         &lt;element name="roleAccessList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomFieldRoleAccessList" minOccurs="0"/>
 *         &lt;element name="deptAccessList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomFieldDepartmentAccessList" minOccurs="0"/>
 *         &lt;element name="subAccessList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomFieldSubAccessList" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:customization_2014_2.setup.webservices.netsuite.com}CustomFieldTranslationsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordCustomField", propOrder = {
    "label",
    "owner",
    "description",
    "selectRecordType",
    "storeValue",
    "showInList",
    "globalSearch",
    "isParent",
    "insertBefore",
    "subtab",
    "displayType",
    "displayWidth",
    "displayHeight",
    "help",
    "parentSubtab",
    "linkText",
    "isMandatory",
    "checkSpelling",
    "maxLength",
    "minValue",
    "maxValue",
    "defaultChecked",
    "defaultValue",
    "isFormula",
    "defaultSelection",
    "dynamicDefault",
    "searchDefault",
    "searchCompareField",
    "sourceList",
    "sourceFrom",
    "sourcefilterby",
    "recType",
    "roleRestrict",
    "filterList",
    "accessLevel",
    "searchLevel",
    "roleAccessList",
    "deptAccessList",
    "subAccessList",
    "translationsList"
})
public class CustomRecordCustomField
    extends CustomFieldType
{

    protected String label;
    protected RecordRef owner;
    protected String description;
    protected RecordRef selectRecordType;
    protected Boolean storeValue;
    protected Boolean showInList;
    protected Boolean globalSearch;
    protected Boolean isParent;
    protected RecordRef insertBefore;
    protected RecordRef subtab;
    protected CustomizationDisplayType displayType;
    protected Long displayWidth;
    protected Long displayHeight;
    protected String help;
    protected RecordRef parentSubtab;
    protected String linkText;
    protected Boolean isMandatory;
    protected Boolean checkSpelling;
    protected Long maxLength;
    protected Double minValue;
    protected Double maxValue;
    protected Boolean defaultChecked;
    protected String defaultValue;
    protected Boolean isFormula;
    protected RecordRef defaultSelection;
    protected CustomizationDynamicDefault dynamicDefault;
    protected RecordRef searchDefault;
    protected RecordRef searchCompareField;
    protected RecordRef sourceList;
    protected RecordRef sourceFrom;
    protected RecordRef sourcefilterby;
    protected String recType;
    protected Boolean roleRestrict;
    protected CustomRecordCustomFieldFilterList filterList;
    protected CustomizationAccessLevel accessLevel;
    protected CustomizationSearchLevel searchLevel;
    protected CustomFieldRoleAccessList roleAccessList;
    protected CustomFieldDepartmentAccessList deptAccessList;
    protected CustomFieldSubAccessList subAccessList;
    protected CustomFieldTranslationsList translationsList;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOwner(RecordRef value) {
        this.owner = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the selectRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSelectRecordType() {
        return selectRecordType;
    }

    /**
     * Sets the value of the selectRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSelectRecordType(RecordRef value) {
        this.selectRecordType = value;
    }

    /**
     * Gets the value of the storeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreValue() {
        return storeValue;
    }

    /**
     * Sets the value of the storeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreValue(Boolean value) {
        this.storeValue = value;
    }

    /**
     * Gets the value of the showInList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInList() {
        return showInList;
    }

    /**
     * Sets the value of the showInList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInList(Boolean value) {
        this.showInList = value;
    }

    /**
     * Gets the value of the globalSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalSearch() {
        return globalSearch;
    }

    /**
     * Sets the value of the globalSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalSearch(Boolean value) {
        this.globalSearch = value;
    }

    /**
     * Gets the value of the isParent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParent() {
        return isParent;
    }

    /**
     * Sets the value of the isParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParent(Boolean value) {
        this.isParent = value;
    }

    /**
     * Gets the value of the insertBefore property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInsertBefore() {
        return insertBefore;
    }

    /**
     * Sets the value of the insertBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInsertBefore(RecordRef value) {
        this.insertBefore = value;
    }

    /**
     * Gets the value of the subtab property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubtab() {
        return subtab;
    }

    /**
     * Sets the value of the subtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubtab(RecordRef value) {
        this.subtab = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationDisplayType }
     *     
     */
    public CustomizationDisplayType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationDisplayType }
     *     
     */
    public void setDisplayType(CustomizationDisplayType value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the displayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisplayWidth() {
        return displayWidth;
    }

    /**
     * Sets the value of the displayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisplayWidth(Long value) {
        this.displayWidth = value;
    }

    /**
     * Gets the value of the displayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisplayHeight() {
        return displayHeight;
    }

    /**
     * Sets the value of the displayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisplayHeight(Long value) {
        this.displayHeight = value;
    }

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelp(String value) {
        this.help = value;
    }

    /**
     * Gets the value of the parentSubtab property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParentSubtab() {
        return parentSubtab;
    }

    /**
     * Sets the value of the parentSubtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParentSubtab(RecordRef value) {
        this.parentSubtab = value;
    }

    /**
     * Gets the value of the linkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkText() {
        return linkText;
    }

    /**
     * Sets the value of the linkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkText(String value) {
        this.linkText = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the checkSpelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckSpelling() {
        return checkSpelling;
    }

    /**
     * Sets the value of the checkSpelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckSpelling(Boolean value) {
        this.checkSpelling = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLength(Long value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the defaultChecked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultChecked() {
        return defaultChecked;
    }

    /**
     * Sets the value of the defaultChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultChecked(Boolean value) {
        this.defaultChecked = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isFormula property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFormula() {
        return isFormula;
    }

    /**
     * Sets the value of the isFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFormula(Boolean value) {
        this.isFormula = value;
    }

    /**
     * Gets the value of the defaultSelection property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDefaultSelection() {
        return defaultSelection;
    }

    /**
     * Sets the value of the defaultSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDefaultSelection(RecordRef value) {
        this.defaultSelection = value;
    }

    /**
     * Gets the value of the dynamicDefault property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationDynamicDefault }
     *     
     */
    public CustomizationDynamicDefault getDynamicDefault() {
        return dynamicDefault;
    }

    /**
     * Sets the value of the dynamicDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationDynamicDefault }
     *     
     */
    public void setDynamicDefault(CustomizationDynamicDefault value) {
        this.dynamicDefault = value;
    }

    /**
     * Gets the value of the searchDefault property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchDefault() {
        return searchDefault;
    }

    /**
     * Sets the value of the searchDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchDefault(RecordRef value) {
        this.searchDefault = value;
    }

    /**
     * Gets the value of the searchCompareField property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchCompareField() {
        return searchCompareField;
    }

    /**
     * Sets the value of the searchCompareField property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchCompareField(RecordRef value) {
        this.searchCompareField = value;
    }

    /**
     * Gets the value of the sourceList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceList() {
        return sourceList;
    }

    /**
     * Sets the value of the sourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceList(RecordRef value) {
        this.sourceList = value;
    }

    /**
     * Gets the value of the sourceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceFrom() {
        return sourceFrom;
    }

    /**
     * Sets the value of the sourceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceFrom(RecordRef value) {
        this.sourceFrom = value;
    }

    /**
     * Gets the value of the sourcefilterby property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourcefilterby() {
        return sourcefilterby;
    }

    /**
     * Sets the value of the sourcefilterby property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourcefilterby(RecordRef value) {
        this.sourcefilterby = value;
    }

    /**
     * Gets the value of the recType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecType() {
        return recType;
    }

    /**
     * Sets the value of the recType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecType(String value) {
        this.recType = value;
    }

    /**
     * Gets the value of the roleRestrict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoleRestrict() {
        return roleRestrict;
    }

    /**
     * Sets the value of the roleRestrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoleRestrict(Boolean value) {
        this.roleRestrict = value;
    }

    /**
     * Gets the value of the filterList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordCustomFieldFilterList }
     *     
     */
    public CustomRecordCustomFieldFilterList getFilterList() {
        return filterList;
    }

    /**
     * Sets the value of the filterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordCustomFieldFilterList }
     *     
     */
    public void setFilterList(CustomRecordCustomFieldFilterList value) {
        this.filterList = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationAccessLevel }
     *     
     */
    public CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationAccessLevel }
     *     
     */
    public void setAccessLevel(CustomizationAccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the searchLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationSearchLevel }
     *     
     */
    public CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }

    /**
     * Sets the value of the searchLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationSearchLevel }
     *     
     */
    public void setSearchLevel(CustomizationSearchLevel value) {
        this.searchLevel = value;
    }

    /**
     * Gets the value of the roleAccessList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldRoleAccessList }
     *     
     */
    public CustomFieldRoleAccessList getRoleAccessList() {
        return roleAccessList;
    }

    /**
     * Sets the value of the roleAccessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldRoleAccessList }
     *     
     */
    public void setRoleAccessList(CustomFieldRoleAccessList value) {
        this.roleAccessList = value;
    }

    /**
     * Gets the value of the deptAccessList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldDepartmentAccessList }
     *     
     */
    public CustomFieldDepartmentAccessList getDeptAccessList() {
        return deptAccessList;
    }

    /**
     * Sets the value of the deptAccessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldDepartmentAccessList }
     *     
     */
    public void setDeptAccessList(CustomFieldDepartmentAccessList value) {
        this.deptAccessList = value;
    }

    /**
     * Gets the value of the subAccessList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldSubAccessList }
     *     
     */
    public CustomFieldSubAccessList getSubAccessList() {
        return subAccessList;
    }

    /**
     * Sets the value of the subAccessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldSubAccessList }
     *     
     */
    public void setSubAccessList(CustomFieldSubAccessList value) {
        this.subAccessList = value;
    }

    /**
     * Gets the value of the translationsList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldTranslationsList }
     *     
     */
    public CustomFieldTranslationsList getTranslationsList() {
        return translationsList;
    }

    /**
     * Sets the value of the translationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldTranslationsList }
     *     
     */
    public void setTranslationsList(CustomFieldTranslationsList value) {
        this.translationsList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

}
