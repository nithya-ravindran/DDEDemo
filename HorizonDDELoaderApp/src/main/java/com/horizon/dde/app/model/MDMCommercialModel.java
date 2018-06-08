package com.horizon.dde.app.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "bid",
    "group_name",
    "name",
    "address1",
    "city",
    "state",
    "zipcode",
    "phone",
    "fax",
    "lastname",
    "firstname",
    "mi",
    "DEGREE",
    "JCode",
    "NASCO",
    "NOTE",
    "JCODE_PANEL_STATUS",
    "JCODE_PANEL_CODE",
    "LANGUAGE",
    "SSN",
    "TAXID",
    "COUNTY",
    "DataID",
    "PRODUCT_SPECIALTY_HOSPITAL",
    "MGCN",
    "TRAD",
    "STNY",
    "NJPL",
    "MCBL",
    "HDTC",
    "HDDC",
    "HDDP",
    "HDDT",
    "MCNY",
    "VSTANY",
    "NYEP",
    "NYPP",
    "ADVN",
    "ACO",
    "PCMH",
    "MALE",
    "FEMALE",
    "Mon_open1",
    "Mon_close1",
    "Mon_open2",
    "Mon_close2",
    "Tue_open1",
    "Tue_close1",
    "Tue_open2",
    "Tue_close2",
    "Wed_open1",
    "Wed_close1",
    "Wed_open2",
    "Wed_close2",
    "Thu_open1",
    "Thu_close1",
    "Thu_open2",
    "Thu_close2",
    "Fri_open1",
    "Fri_close1",
    "Fri_open2",
    "Fri_close2",
    "Sat_open1",
    "Sat_close1",
    "Sat_open2",
    "Sat_close2",
    "Sun_open1",
    "Sun_close1",
    "Sun_open2",
    "Sun_close2",
    "NATIONALPROVIDERID",
    "NET_START_DATE",
    "DMAX",
    "LUCENT",
    "OFFCODE",
    "ANCTEST",
    "HOSPCODE",
    "HOSP",
    "RPQ",
    "HORIZON_DENTAL_EPO",
    "BOARD_CERTIFIED",
    "SPECIALTY",
    "LATITUDE",
    "LONGITUDE",
    "EHR",
    "QRP",
    "NCQA",
    "HNJH_IND",
    "PRACTICE_LIMITATION",
    "ACPT_NEW_PAT",
    "MCR_RATING",
    "MBPC",
    "SHMC",
    "CCX",
    "OMT1",
    "OMT2",
    "OAT1",
    "OST2",
    "OST1",
    "OAT2",
    "OMT1_EFF_DT",
    "OMT1_END_DT",
    "OMT2_EFF_DT",
    "OMT2_END_DT",
    "OAT1_EFF_DT",
    "OAT1_END_DT",
    "OST2_EFF_DT",
    "OST2_END_DT",
    "OST1_EFF_DT",
    "OST1_END_DT",
    "OAT2_EFF_DT",
    "OAT2_END_DT",
    "TRAD_EFF_DT",
    "TRAD_END_DT",
    "MGCN_EFF_DT",
    "MGCN_END_DT",
    "MCBL_EFF_DT",
    "MCBL_END_DT",
    "ADVN_EFF_DT",
    "ADVN_END_DT",
    "ACO_EFF_DT",
    "ACO_END_DT",
    "PCMH_EFF_DT",
    "PCMH_END_DT",
    "MBPC_EFF_DT",
    "MBPC_END_DT",
    "SHMC_EFF_DT",
    "SHMC_END_DT",
    "RWJB",
    "RWJB_EFF_DT",
    "RWJB_END_DT",
    "MBAV",
    "MBAV_EFF_DT",
    "MBAV_END_DT",
    "HMIC",
    "HMIC_EFF_DT",
    "HMIC_END_DT",
    "INSP",
    "INSP_EFF_DT",
    "INSP_END_DT",
    "TRNT",
    "TRNT_EFF_DT",
    "TRNT_END_DT"
})
public class MDMCommercialModel implements Serializable
{

    @JsonProperty("type")
    private String tYPE;
    @JsonProperty("bid")
    private String bID;
    @JsonProperty("GROUP_NAME")
    private String gROUPNAME;
    @JsonProperty("NAME")
    private String nAME;
    @JsonProperty("ADDRESS1")
    private String aDDRESS1;
    @JsonProperty("CITY")
    private String cITY;
    @JsonProperty("STATE")
    private String sTATE;
    @JsonProperty("ZIPCODE")
    private String zIPCODE;
    @JsonProperty("PHONE")
    private String pHONE;
    @JsonProperty("FAX")
    private String fAX;
    @JsonProperty("LASTNAME")
    private String lASTNAME;
    @JsonProperty("FIRSTNAME")
    private String fIRSTNAME;
    @JsonProperty("MI")
    private String mI;
    @JsonProperty("DEGREE")
    private String dEGREE;
    @JsonProperty("JCode")
    private String jCode;
    @JsonProperty("NASCO")
    private String nASCO;
    @JsonProperty("NOTE")
    private String nOTE;
    @JsonProperty("JCODE_PANEL_STATUS")
    private String jCODEPANELSTATUS;
    @JsonProperty("JCODE_PANEL_CODE")
    private String jCODEPANELCODE;
    @JsonProperty("LANGUAGE")
    private String lANGUAGE;
    @JsonProperty("SSN")
    private String sSN;
    @JsonProperty("TAXID")
    private String tAXID;
    @JsonProperty("COUNTY")
    private String cOUNTY;
    @JsonProperty("DataID")
    private String dataID;
    @JsonProperty("PRODUCT_SPECIALTY_HOSPITAL")
    private String pRODUCTSPECIALTYHOSPITAL;
    @JsonProperty("MGCN")
    private String mGCN;
    @JsonProperty("TRAD")
    private String tRAD;
    @JsonProperty("STNY")
    private String sTNY;
    @JsonProperty("NJPL")
    private String nJPL;
    @JsonProperty("MCBL")
    private String mCBL;
    @JsonProperty("HDTC")
    private String hDTC;
    @JsonProperty("HDDC")
    private String hDDC;
    @JsonProperty("HDDP")
    private String hDDP;
    @JsonProperty("HDDT")
    private String hDDT;
    @JsonProperty("MCNY")
    private String mCNY;
    @JsonProperty("VSTANY")
    private String vSTANY;
    @JsonProperty("NYEP")
    private String nYEP;
    @JsonProperty("NYPP")
    private String nYPP;
    @JsonProperty("ADVN")
    private String aDVN;
    @JsonProperty("ACO")
    private String aCO;
    @JsonProperty("PCMH")
    private String pCMH;
    @JsonProperty("MALE")
    private String mALE;
    @JsonProperty("FEMALE")
    private String fEMALE;
    @JsonProperty("Mon_open1")
    private String monOpen1;
    @JsonProperty("Mon_close1")
    private String monClose1;
    @JsonProperty("Mon_open2")
    private String monOpen2;
    @JsonProperty("Mon_close2")
    private String monClose2;
    @JsonProperty("Tue_open1")
    private String tueOpen1;
    @JsonProperty("Tue_close1")
    private String tueClose1;
    @JsonProperty("Tue_open2")
    private String tueOpen2;
    @JsonProperty("Tue_close2")
    private String tueClose2;
    @JsonProperty("Wed_open1")
    private String wedOpen1;
    @JsonProperty("Wed_close1")
    private String wedClose1;
    @JsonProperty("Wed_open2")
    private String wedOpen2;
    @JsonProperty("Wed_close2")
    private String wedClose2;
    @JsonProperty("Thu_open1")
    private String thuOpen1;
    @JsonProperty("Thu_close1")
    private String thuClose1;
    @JsonProperty("Thu_open2")
    private String thuOpen2;
    @JsonProperty("Thu_close2")
    private String thuClose2;
    @JsonProperty("Fri_open1")
    private String friOpen1;
    @JsonProperty("Fri_close1")
    private String friClose1;
    @JsonProperty("Fri_open2")
    private String friOpen2;
    @JsonProperty("Fri_close2")
    private String friClose2;
    @JsonProperty("Sat_open1")
    private String satOpen1;
    @JsonProperty("Sat_close1")
    private String satClose1;
    @JsonProperty("Sat_open2")
    private String satOpen2;
    @JsonProperty("Sat_close2")
    private String satClose2;
    @JsonProperty("Sun_open1")
    private String sunOpen1;
    @JsonProperty("Sun_close1")
    private String sunClose1;
    @JsonProperty("Sun_open2")
    private String sunOpen2;
    @JsonProperty("Sun_close2")
    private String sunClose2;
    @JsonProperty("NATIONALPROVIDERID")
    private String nATIONALPROVIDERID;
    @JsonProperty("NET_START_DATE")
    private String nETSTARTDATE;
    @JsonProperty("DMAX")
    private String dMAX;
    @JsonProperty("LUCENT")
    private String lUCENT;
    @JsonProperty("OFFCODE")
    private String oFFCODE;
    @JsonProperty("ANCTEST")
    private String aNCTEST;
    @JsonProperty("HOSPCODE")
    private String hOSPCODE;
    @JsonProperty("HOSP")
    private String hOSP;
    @JsonProperty("RPQ")
    private String rPQ;
    @JsonProperty("HORIZON_DENTAL_EPO")
    private String hORIZONDENTALEPO;
    @JsonProperty("BOARD_CERTIFIED")
    private String bOARDCERTIFIED;
    @JsonProperty("SPECIALTY")
    private String sPECIALTY;
    @JsonProperty("LATITUDE")
    private String lATITUDE;
    @JsonProperty("LONGITUDE")
    private String lONGITUDE;
    @JsonProperty("EHR")
    private String eHR;
    @JsonProperty("QRP")
    private String qRP;
    @JsonProperty("NCQA")
    private String nCQA;
    @JsonProperty("HNJH_IND")
    private String hNJHIND;
    @JsonProperty("PRACTICE_LIMITATION")
    private String pRACTICELIMITATION;
    @JsonProperty("ACPT_NEW_PAT")
    private String aCPTNEWPAT;
    @JsonProperty("MCR_RATING")
    private String mCRRATING;
    @JsonProperty("MBPC")
    private String mBPC;
    @JsonProperty("SHMC")
    private String sHMC;
    @JsonProperty("CCX")
    private String cCX;
    @JsonProperty("OMT1")
    private String oMT1;
    @JsonProperty("OMT2")
    private String oMT2;
    @JsonProperty("OAT1")
    private String oAT1;
    @JsonProperty("OST2")
    private String oST2;
    @JsonProperty("OST1")
    private String oST1;
    @JsonProperty("OAT2")
    private String oAT2;
    @JsonProperty("OMT1_EFF_DT")
    private String oMT1EFFDT;
    @JsonProperty("OMT1_END_DT")
    private String oMT1ENDDT;
    @JsonProperty("OMT2_EFF_DT")
    private String oMT2EFFDT;
    @JsonProperty("OMT2_END_DT")
    private String oMT2ENDDT;
    @JsonProperty("OAT1_EFF_DT")
    private String oAT1EFFDT;
    @JsonProperty("OAT1_END_DT")
    private String oAT1ENDDT;
    @JsonProperty("OST2_EFF_DT")
    private String oST2EFFDT;
    @JsonProperty("OST2_END_DT")
    private String oST2ENDDT;
    @JsonProperty("OST1_EFF_DT")
    private String oST1EFFDT;
    @JsonProperty("OST1_END_DT")
    private String oST1ENDDT;
    @JsonProperty("OAT2_EFF_DT")
    private String oAT2EFFDT;
    @JsonProperty("OAT2_END_DT")
    private String oAT2ENDDT;
    @JsonProperty("TRAD_EFF_DT")
    private String tRADEFFDT;
    @JsonProperty("TRAD_END_DT")
    private String tRADENDDT;
    @JsonProperty("MGCN_EFF_DT")
    private String mGCNEFFDT;
    @JsonProperty("MGCN_END_DT")
    private String mGCNENDDT;
    @JsonProperty("MCBL_EFF_DT")
    private String mCBLEFFDT;
    @JsonProperty("MCBL_END_DT")
    private String mCBLENDDT;
    @JsonProperty("ADVN_EFF_DT")
    private String aDVNEFFDT;
    @JsonProperty("ADVN_END_DT")
    private String aDVNENDDT;
    @JsonProperty("ACO_EFF_DT")
    private String aCOEFFDT;
    @JsonProperty("ACO_END_DT")
    private String aCOENDDT;
    @JsonProperty("PCMH_EFF_DT")
    private String pCMHEFFDT;
    @JsonProperty("PCMH_END_DT")
    private String pCMHENDDT;
    @JsonProperty("MBPC_EFF_DT")
    private String mBPCEFFDT;
    @JsonProperty("MBPC_END_DT")
    private String mBPCENDDT;
    @JsonProperty("SHMC_EFF_DT")
    private String sHMCEFFDT;
    @JsonProperty("SHMC_END_DT")
    private String sHMCENDDT;
    @JsonProperty("RWJB")
    private String rWJB;
    @JsonProperty("RWJB_EFF_DT")
    private String rWJBEFFDT;
    @JsonProperty("RWJB_END_DT")
    private String rWJBENDDT;
    @JsonProperty("MBAV")
    private String mBAV;
    @JsonProperty("MBAV_EFF_DT")
    private String mBAVEFFDT;
    @JsonProperty("MBAV_END_DT")
    private String mBAVENDDT;
    @JsonProperty("HMIC")
    private String hMIC;
    @JsonProperty("HMIC_EFF_DT")
    private String hMICEFFDT;
    @JsonProperty("HMIC_END_DT")
    private String hMICENDDT;
    @JsonProperty("INSP")
    private String iNSP;
    @JsonProperty("INSP_EFF_DT")
    private String iNSPEFFDT;
    @JsonProperty("INSP_END_DT")
    private String iNSPENDDT;
    @JsonProperty("TRNT")
    private String tRNT;
    @JsonProperty("TRNT_EFF_DT")
    private String tRNTEFFDT;
    @JsonProperty("TRNT_END_DT")
    private String tRNTENDDT;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 418007942141577470L;

    @JsonProperty("type")
    public String getTYPE() {
        return tYPE;
    }

    @JsonProperty("type")
    public void setTYPE(String tYPE) {
        this.tYPE = tYPE;
    }

    @JsonProperty("bid")
    public String getBID() {
        return bID;
    }

    @JsonProperty("bid")
    public void setBID(String bID) {
        this.bID = bID;
    }

    @JsonProperty("GROUP_NAME")
    public String getGROUPNAME() {
        return gROUPNAME;
    }

    @JsonProperty("GROUP_NAME")
    public void setGROUPNAME(String gROUPNAME) {
        this.gROUPNAME = gROUPNAME;
    }

    @JsonProperty("NAME")
    public String getNAME() {
        return nAME;
    }

    @JsonProperty("NAME")
    public void setNAME(String nAME) {
        this.nAME = nAME;
    }

    @JsonProperty("ADDRESS1")
    public String getADDRESS1() {
        return aDDRESS1;
    }

    @JsonProperty("ADDRESS1")
    public void setADDRESS1(String aDDRESS1) {
        this.aDDRESS1 = aDDRESS1;
    }

    @JsonProperty("CITY")
    public String getCITY() {
        return cITY;
    }

    @JsonProperty("CITY")
    public void setCITY(String cITY) {
        this.cITY = cITY;
    }

    @JsonProperty("STATE")
    public String getSTATE() {
        return sTATE;
    }

    @JsonProperty("STATE")
    public void setSTATE(String sTATE) {
        this.sTATE = sTATE;
    }

    @JsonProperty("ZIPCODE")
    public String getZIPCODE() {
        return zIPCODE;
    }

    @JsonProperty("ZIPCODE")
    public void setZIPCODE(String zIPCODE) {
        this.zIPCODE = zIPCODE;
    }

    @JsonProperty("PHONE")
    public String getPHONE() {
        return pHONE;
    }

    @JsonProperty("PHONE")
    public void setPHONE(String pHONE) {
        this.pHONE = pHONE;
    }

    @JsonProperty("FAX")
    public String getFAX() {
        return fAX;
    }

    @JsonProperty("FAX")
    public void setFAX(String fAX) {
        this.fAX = fAX;
    }

    @JsonProperty("LASTNAME")
    public String getLASTNAME() {
        return lASTNAME;
    }

    @JsonProperty("LASTNAME")
    public void setLASTNAME(String lASTNAME) {
        this.lASTNAME = lASTNAME;
    }

    @JsonProperty("FIRSTNAME")
    public String getFIRSTNAME() {
        return fIRSTNAME;
    }

    @JsonProperty("FIRSTNAME")
    public void setFIRSTNAME(String fIRSTNAME) {
        this.fIRSTNAME = fIRSTNAME;
    }

    @JsonProperty("MI")
    public String getMI() {
        return mI;
    }

    @JsonProperty("MI")
    public void setMI(String mI) {
        this.mI = mI;
    }

    @JsonProperty("DEGREE")
    public String getDEGREE() {
        return dEGREE;
    }

    @JsonProperty("DEGREE")
    public void setDEGREE(String dEGREE) {
        this.dEGREE = dEGREE;
    }

    @JsonProperty("JCode")
    public String getJCode() {
        return jCode;
    }

    @JsonProperty("JCode")
    public void setJCode(String jCode) {
        this.jCode = jCode;
    }

    @JsonProperty("NASCO")
    public String getNASCO() {
        return nASCO;
    }

    @JsonProperty("NASCO")
    public void setNASCO(String nASCO) {
        this.nASCO = nASCO;
    }

    @JsonProperty("NOTE")
    public String getNOTE() {
        return nOTE;
    }

    @JsonProperty("NOTE")
    public void setNOTE(String nOTE) {
        this.nOTE = nOTE;
    }

    @JsonProperty("JCODE_PANEL_STATUS")
    public String getJCODEPANELSTATUS() {
        return jCODEPANELSTATUS;
    }

    @JsonProperty("JCODE_PANEL_STATUS")
    public void setJCODEPANELSTATUS(String jCODEPANELSTATUS) {
        this.jCODEPANELSTATUS = jCODEPANELSTATUS;
    }

    @JsonProperty("JCODE_PANEL_CODE")
    public String getJCODEPANELCODE() {
        return jCODEPANELCODE;
    }

    @JsonProperty("JCODE_PANEL_CODE")
    public void setJCODEPANELCODE(String jCODEPANELCODE) {
        this.jCODEPANELCODE = jCODEPANELCODE;
    }

    @JsonProperty("LANGUAGE")
    public String getLANGUAGE() {
        return lANGUAGE;
    }

    @JsonProperty("LANGUAGE")
    public void setLANGUAGE(String lANGUAGE) {
        this.lANGUAGE = lANGUAGE;
    }

    @JsonProperty("SSN")
    public String getSSN() {
        return sSN;
    }

    @JsonProperty("SSN")
    public void setSSN(String sSN) {
        this.sSN = sSN;
    }

    @JsonProperty("TAXID")
    public String getTAXID() {
        return tAXID;
    }

    @JsonProperty("TAXID")
    public void setTAXID(String tAXID) {
        this.tAXID = tAXID;
    }

    @JsonProperty("COUNTY")
    public String getCOUNTY() {
        return cOUNTY;
    }

    @JsonProperty("COUNTY")
    public void setCOUNTY(String cOUNTY) {
        this.cOUNTY = cOUNTY;
    }

    @JsonProperty("DataID")
    public String getDataID() {
        return dataID;
    }

    @JsonProperty("DataID")
    public void setDataID(String dataID) {
        this.dataID = dataID;
    }

    @JsonProperty("PRODUCT_SPECIALTY_HOSPITAL")
    public String getPRODUCTSPECIALTYHOSPITAL() {
        return pRODUCTSPECIALTYHOSPITAL;
    }

    @JsonProperty("PRODUCT_SPECIALTY_HOSPITAL")
    public void setPRODUCTSPECIALTYHOSPITAL(String pRODUCTSPECIALTYHOSPITAL) {
        this.pRODUCTSPECIALTYHOSPITAL = pRODUCTSPECIALTYHOSPITAL;
    }

    @JsonProperty("MGCN")
    public String getMGCN() {
        return mGCN;
    }

    @JsonProperty("MGCN")
    public void setMGCN(String mGCN) {
        this.mGCN = mGCN;
    }

    @JsonProperty("TRAD")
    public String getTRAD() {
        return tRAD;
    }

    @JsonProperty("TRAD")
    public void setTRAD(String tRAD) {
        this.tRAD = tRAD;
    }

    @JsonProperty("STNY")
    public String getSTNY() {
        return sTNY;
    }

    @JsonProperty("STNY")
    public void setSTNY(String sTNY) {
        this.sTNY = sTNY;
    }

    @JsonProperty("NJPL")
    public String getNJPL() {
        return nJPL;
    }

    @JsonProperty("NJPL")
    public void setNJPL(String nJPL) {
        this.nJPL = nJPL;
    }

    @JsonProperty("MCBL")
    public String getMCBL() {
        return mCBL;
    }

    @JsonProperty("MCBL")
    public void setMCBL(String mCBL) {
        this.mCBL = mCBL;
    }

    @JsonProperty("HDTC")
    public String getHDTC() {
        return hDTC;
    }

    @JsonProperty("HDTC")
    public void setHDTC(String hDTC) {
        this.hDTC = hDTC;
    }

    @JsonProperty("HDDC")
    public String getHDDC() {
        return hDDC;
    }

    @JsonProperty("HDDC")
    public void setHDDC(String hDDC) {
        this.hDDC = hDDC;
    }

    @JsonProperty("HDDP")
    public String getHDDP() {
        return hDDP;
    }

    @JsonProperty("HDDP")
    public void setHDDP(String hDDP) {
        this.hDDP = hDDP;
    }

    @JsonProperty("HDDT")
    public String getHDDT() {
        return hDDT;
    }

    @JsonProperty("HDDT")
    public void setHDDT(String hDDT) {
        this.hDDT = hDDT;
    }

    @JsonProperty("MCNY")
    public String getMCNY() {
        return mCNY;
    }

    @JsonProperty("MCNY")
    public void setMCNY(String mCNY) {
        this.mCNY = mCNY;
    }

    @JsonProperty("VSTANY")
    public String getVSTANY() {
        return vSTANY;
    }

    @JsonProperty("VSTANY")
    public void setVSTANY(String vSTANY) {
        this.vSTANY = vSTANY;
    }

    @JsonProperty("NYEP")
    public String getNYEP() {
        return nYEP;
    }

    @JsonProperty("NYEP")
    public void setNYEP(String nYEP) {
        this.nYEP = nYEP;
    }

    @JsonProperty("NYPP")
    public String getNYPP() {
        return nYPP;
    }

    @JsonProperty("NYPP")
    public void setNYPP(String nYPP) {
        this.nYPP = nYPP;
    }

    @JsonProperty("ADVN")
    public String getADVN() {
        return aDVN;
    }

    @JsonProperty("ADVN")
    public void setADVN(String aDVN) {
        this.aDVN = aDVN;
    }

    @JsonProperty("ACO")
    public String getACO() {
        return aCO;
    }

    @JsonProperty("ACO")
    public void setACO(String aCO) {
        this.aCO = aCO;
    }

    @JsonProperty("PCMH")
    public String getPCMH() {
        return pCMH;
    }

    @JsonProperty("PCMH")
    public void setPCMH(String pCMH) {
        this.pCMH = pCMH;
    }

    @JsonProperty("MALE")
    public String getMALE() {
        return mALE;
    }

    @JsonProperty("MALE")
    public void setMALE(String mALE) {
        this.mALE = mALE;
    }

    @JsonProperty("FEMALE")
    public String getFEMALE() {
        return fEMALE;
    }

    @JsonProperty("FEMALE")
    public void setFEMALE(String fEMALE) {
        this.fEMALE = fEMALE;
    }

    @JsonProperty("Mon_open1")
    public String getMonOpen1() {
        return monOpen1;
    }

    @JsonProperty("Mon_open1")
    public void setMonOpen1(String monOpen1) {
        this.monOpen1 = monOpen1;
    }

    @JsonProperty("Mon_close1")
    public String getMonClose1() {
        return monClose1;
    }

    @JsonProperty("Mon_close1")
    public void setMonClose1(String monClose1) {
        this.monClose1 = monClose1;
    }

    @JsonProperty("Mon_open2")
    public String getMonOpen2() {
        return monOpen2;
    }

    @JsonProperty("Mon_open2")
    public void setMonOpen2(String monOpen2) {
        this.monOpen2 = monOpen2;
    }

    @JsonProperty("Mon_close2")
    public String getMonClose2() {
        return monClose2;
    }

    @JsonProperty("Mon_close2")
    public void setMonClose2(String monClose2) {
        this.monClose2 = monClose2;
    }

    @JsonProperty("Tue_open1")
    public String getTueOpen1() {
        return tueOpen1;
    }

    @JsonProperty("Tue_open1")
    public void setTueOpen1(String tueOpen1) {
        this.tueOpen1 = tueOpen1;
    }

    @JsonProperty("Tue_close1")
    public String getTueClose1() {
        return tueClose1;
    }

    @JsonProperty("Tue_close1")
    public void setTueClose1(String tueClose1) {
        this.tueClose1 = tueClose1;
    }

    @JsonProperty("Tue_open2")
    public String getTueOpen2() {
        return tueOpen2;
    }

    @JsonProperty("Tue_open2")
    public void setTueOpen2(String tueOpen2) {
        this.tueOpen2 = tueOpen2;
    }

    @JsonProperty("Tue_close2")
    public String getTueClose2() {
        return tueClose2;
    }

    @JsonProperty("Tue_close2")
    public void setTueClose2(String tueClose2) {
        this.tueClose2 = tueClose2;
    }

    @JsonProperty("Wed_open1")
    public String getWedOpen1() {
        return wedOpen1;
    }

    @JsonProperty("Wed_open1")
    public void setWedOpen1(String wedOpen1) {
        this.wedOpen1 = wedOpen1;
    }

    @JsonProperty("Wed_close1")
    public String getWedClose1() {
        return wedClose1;
    }

    @JsonProperty("Wed_close1")
    public void setWedClose1(String wedClose1) {
        this.wedClose1 = wedClose1;
    }

    @JsonProperty("Wed_open2")
    public String getWedOpen2() {
        return wedOpen2;
    }

    @JsonProperty("Wed_open2")
    public void setWedOpen2(String wedOpen2) {
        this.wedOpen2 = wedOpen2;
    }

    @JsonProperty("Wed_close2")
    public String getWedClose2() {
        return wedClose2;
    }

    @JsonProperty("Wed_close2")
    public void setWedClose2(String wedClose2) {
        this.wedClose2 = wedClose2;
    }

    @JsonProperty("Thu_open1")
    public String getThuOpen1() {
        return thuOpen1;
    }

    @JsonProperty("Thu_open1")
    public void setThuOpen1(String thuOpen1) {
        this.thuOpen1 = thuOpen1;
    }

    @JsonProperty("Thu_close1")
    public String getThuClose1() {
        return thuClose1;
    }

    @JsonProperty("Thu_close1")
    public void setThuClose1(String thuClose1) {
        this.thuClose1 = thuClose1;
    }

    @JsonProperty("Thu_open2")
    public String getThuOpen2() {
        return thuOpen2;
    }

    @JsonProperty("Thu_open2")
    public void setThuOpen2(String thuOpen2) {
        this.thuOpen2 = thuOpen2;
    }

    @JsonProperty("Thu_close2")
    public String getThuClose2() {
        return thuClose2;
    }

    @JsonProperty("Thu_close2")
    public void setThuClose2(String thuClose2) {
        this.thuClose2 = thuClose2;
    }

    @JsonProperty("Fri_open1")
    public String getFriOpen1() {
        return friOpen1;
    }

    @JsonProperty("Fri_open1")
    public void setFriOpen1(String friOpen1) {
        this.friOpen1 = friOpen1;
    }

    @JsonProperty("Fri_close1")
    public String getFriClose1() {
        return friClose1;
    }

    @JsonProperty("Fri_close1")
    public void setFriClose1(String friClose1) {
        this.friClose1 = friClose1;
    }

    @JsonProperty("Fri_open2")
    public String getFriOpen2() {
        return friOpen2;
    }

    @JsonProperty("Fri_open2")
    public void setFriOpen2(String friOpen2) {
        this.friOpen2 = friOpen2;
    }

    @JsonProperty("Fri_close2")
    public String getFriClose2() {
        return friClose2;
    }

    @JsonProperty("Fri_close2")
    public void setFriClose2(String friClose2) {
        this.friClose2 = friClose2;
    }

    @JsonProperty("Sat_open1")
    public String getSatOpen1() {
        return satOpen1;
    }

    @JsonProperty("Sat_open1")
    public void setSatOpen1(String satOpen1) {
        this.satOpen1 = satOpen1;
    }

    @JsonProperty("Sat_close1")
    public String getSatClose1() {
        return satClose1;
    }

    @JsonProperty("Sat_close1")
    public void setSatClose1(String satClose1) {
        this.satClose1 = satClose1;
    }

    @JsonProperty("Sat_open2")
    public String getSatOpen2() {
        return satOpen2;
    }

    @JsonProperty("Sat_open2")
    public void setSatOpen2(String satOpen2) {
        this.satOpen2 = satOpen2;
    }

    @JsonProperty("Sat_close2")
    public String getSatClose2() {
        return satClose2;
    }

    @JsonProperty("Sat_close2")
    public void setSatClose2(String satClose2) {
        this.satClose2 = satClose2;
    }

    @JsonProperty("Sun_open1")
    public String getSunOpen1() {
        return sunOpen1;
    }

    @JsonProperty("Sun_open1")
    public void setSunOpen1(String sunOpen1) {
        this.sunOpen1 = sunOpen1;
    }

    @JsonProperty("Sun_close1")
    public String getSunClose1() {
        return sunClose1;
    }

    @JsonProperty("Sun_close1")
    public void setSunClose1(String sunClose1) {
        this.sunClose1 = sunClose1;
    }

    @JsonProperty("Sun_open2")
    public String getSunOpen2() {
        return sunOpen2;
    }

    @JsonProperty("Sun_open2")
    public void setSunOpen2(String sunOpen2) {
        this.sunOpen2 = sunOpen2;
    }

    @JsonProperty("Sun_close2")
    public String getSunClose2() {
        return sunClose2;
    }

    @JsonProperty("Sun_close2")
    public void setSunClose2(String sunClose2) {
        this.sunClose2 = sunClose2;
    }

    @JsonProperty("NATIONALPROVIDERID")
    public String getNATIONALPROVIDERID() {
        return nATIONALPROVIDERID;
    }

    @JsonProperty("NATIONALPROVIDERID")
    public void setNATIONALPROVIDERID(String nATIONALPROVIDERID) {
        this.nATIONALPROVIDERID = nATIONALPROVIDERID;
    }

    @JsonProperty("NET_START_DATE")
    public String getNETSTARTDATE() {
        return nETSTARTDATE;
    }

    @JsonProperty("NET_START_DATE")
    public void setNETSTARTDATE(String nETSTARTDATE) {
        this.nETSTARTDATE = nETSTARTDATE;
    }

    @JsonProperty("DMAX")
    public String getDMAX() {
        return dMAX;
    }

    @JsonProperty("DMAX")
    public void setDMAX(String dMAX) {
        this.dMAX = dMAX;
    }

    @JsonProperty("LUCENT")
    public String getLUCENT() {
        return lUCENT;
    }

    @JsonProperty("LUCENT")
    public void setLUCENT(String lUCENT) {
        this.lUCENT = lUCENT;
    }

    @JsonProperty("OFFCODE")
    public String getOFFCODE() {
        return oFFCODE;
    }

    @JsonProperty("OFFCODE")
    public void setOFFCODE(String oFFCODE) {
        this.oFFCODE = oFFCODE;
    }

    @JsonProperty("ANCTEST")
    public String getANCTEST() {
        return aNCTEST;
    }

    @JsonProperty("ANCTEST")
    public void setANCTEST(String aNCTEST) {
        this.aNCTEST = aNCTEST;
    }

    @JsonProperty("HOSPCODE")
    public String getHOSPCODE() {
        return hOSPCODE;
    }

    @JsonProperty("HOSPCODE")
    public void setHOSPCODE(String hOSPCODE) {
        this.hOSPCODE = hOSPCODE;
    }

    @JsonProperty("HOSP")
    public String getHOSP() {
        return hOSP;
    }

    @JsonProperty("HOSP")
    public void setHOSP(String hOSP) {
        this.hOSP = hOSP;
    }

    @JsonProperty("RPQ")
    public String getRPQ() {
        return rPQ;
    }

    @JsonProperty("RPQ")
    public void setRPQ(String rPQ) {
        this.rPQ = rPQ;
    }

    @JsonProperty("HORIZON_DENTAL_EPO")
    public String getHORIZONDENTALEPO() {
        return hORIZONDENTALEPO;
    }

    @JsonProperty("HORIZON_DENTAL_EPO")
    public void setHORIZONDENTALEPO(String hORIZONDENTALEPO) {
        this.hORIZONDENTALEPO = hORIZONDENTALEPO;
    }

    @JsonProperty("BOARD_CERTIFIED")
    public String getBOARDCERTIFIED() {
        return bOARDCERTIFIED;
    }

    @JsonProperty("BOARD_CERTIFIED")
    public void setBOARDCERTIFIED(String bOARDCERTIFIED) {
        this.bOARDCERTIFIED = bOARDCERTIFIED;
    }

    @JsonProperty("SPECIALTY")
    public String getSPECIALTY() {
        return sPECIALTY;
    }

    @JsonProperty("SPECIALTY")
    public void setSPECIALTY(String sPECIALTY) {
        this.sPECIALTY = sPECIALTY;
    }

    @JsonProperty("LATITUDE")
    public String getLATITUDE() {
        return lATITUDE;
    }

    @JsonProperty("LATITUDE")
    public void setLATITUDE(String lATITUDE) {
        this.lATITUDE = lATITUDE;
    }

    @JsonProperty("LONGITUDE")
    public String getLONGITUDE() {
        return lONGITUDE;
    }

    @JsonProperty("LONGITUDE")
    public void setLONGITUDE(String lONGITUDE) {
        this.lONGITUDE = lONGITUDE;
    }

    @JsonProperty("EHR")
    public String getEHR() {
        return eHR;
    }

    @JsonProperty("EHR")
    public void setEHR(String eHR) {
        this.eHR = eHR;
    }

    @JsonProperty("QRP")
    public String getQRP() {
        return qRP;
    }

    @JsonProperty("QRP")
    public void setQRP(String qRP) {
        this.qRP = qRP;
    }

    @JsonProperty("NCQA")
    public String getNCQA() {
        return nCQA;
    }

    @JsonProperty("NCQA")
    public void setNCQA(String nCQA) {
        this.nCQA = nCQA;
    }

    @JsonProperty("HNJH_IND")
    public String getHNJHIND() {
        return hNJHIND;
    }

    @JsonProperty("HNJH_IND")
    public void setHNJHIND(String hNJHIND) {
        this.hNJHIND = hNJHIND;
    }

    @JsonProperty("PRACTICE_LIMITATION")
    public String getPRACTICELIMITATION() {
        return pRACTICELIMITATION;
    }

    @JsonProperty("PRACTICE_LIMITATION")
    public void setPRACTICELIMITATION(String pRACTICELIMITATION) {
        this.pRACTICELIMITATION = pRACTICELIMITATION;
    }

    @JsonProperty("ACPT_NEW_PAT")
    public String getACPTNEWPAT() {
        return aCPTNEWPAT;
    }

    @JsonProperty("ACPT_NEW_PAT")
    public void setACPTNEWPAT(String aCPTNEWPAT) {
        this.aCPTNEWPAT = aCPTNEWPAT;
    }

    @JsonProperty("MCR_RATING")
    public String getMCRRATING() {
        return mCRRATING;
    }

    @JsonProperty("MCR_RATING")
    public void setMCRRATING(String mCRRATING) {
        this.mCRRATING = mCRRATING;
    }

    @JsonProperty("MBPC")
    public String getMBPC() {
        return mBPC;
    }

    @JsonProperty("MBPC")
    public void setMBPC(String mBPC) {
        this.mBPC = mBPC;
    }

    @JsonProperty("SHMC")
    public String getSHMC() {
        return sHMC;
    }

    @JsonProperty("SHMC")
    public void setSHMC(String sHMC) {
        this.sHMC = sHMC;
    }

    @JsonProperty("CCX")
    public String getCCX() {
        return cCX;
    }

    @JsonProperty("CCX")
    public void setCCX(String cCX) {
        this.cCX = cCX;
    }

    @JsonProperty("OMT1")
    public String getOMT1() {
        return oMT1;
    }

    @JsonProperty("OMT1")
    public void setOMT1(String oMT1) {
        this.oMT1 = oMT1;
    }

    @JsonProperty("OMT2")
    public String getOMT2() {
        return oMT2;
    }

    @JsonProperty("OMT2")
    public void setOMT2(String oMT2) {
        this.oMT2 = oMT2;
    }

    @JsonProperty("OAT1")
    public String getOAT1() {
        return oAT1;
    }

    @JsonProperty("OAT1")
    public void setOAT1(String oAT1) {
        this.oAT1 = oAT1;
    }

    @JsonProperty("OST2")
    public String getOST2() {
        return oST2;
    }

    @JsonProperty("OST2")
    public void setOST2(String oST2) {
        this.oST2 = oST2;
    }

    @JsonProperty("OST1")
    public String getOST1() {
        return oST1;
    }

    @JsonProperty("OST1")
    public void setOST1(String oST1) {
        this.oST1 = oST1;
    }

    @JsonProperty("OAT2")
    public String getOAT2() {
        return oAT2;
    }

    @JsonProperty("OAT2")
    public void setOAT2(String oAT2) {
        this.oAT2 = oAT2;
    }

    @JsonProperty("OMT1_EFF_DT")
    public String getOMT1EFFDT() {
        return oMT1EFFDT;
    }

    @JsonProperty("OMT1_EFF_DT")
    public void setOMT1EFFDT(String oMT1EFFDT) {
        this.oMT1EFFDT = oMT1EFFDT;
    }

    @JsonProperty("OMT1_END_DT")
    public String getOMT1ENDDT() {
        return oMT1ENDDT;
    }

    @JsonProperty("OMT1_END_DT")
    public void setOMT1ENDDT(String oMT1ENDDT) {
        this.oMT1ENDDT = oMT1ENDDT;
    }

    @JsonProperty("OMT2_EFF_DT")
    public String getOMT2EFFDT() {
        return oMT2EFFDT;
    }

    @JsonProperty("OMT2_EFF_DT")
    public void setOMT2EFFDT(String oMT2EFFDT) {
        this.oMT2EFFDT = oMT2EFFDT;
    }

    @JsonProperty("OMT2_END_DT")
    public String getOMT2ENDDT() {
        return oMT2ENDDT;
    }

    @JsonProperty("OMT2_END_DT")
    public void setOMT2ENDDT(String oMT2ENDDT) {
        this.oMT2ENDDT = oMT2ENDDT;
    }

    @JsonProperty("OAT1_EFF_DT")
    public String getOAT1EFFDT() {
        return oAT1EFFDT;
    }

    @JsonProperty("OAT1_EFF_DT")
    public void setOAT1EFFDT(String oAT1EFFDT) {
        this.oAT1EFFDT = oAT1EFFDT;
    }

    @JsonProperty("OAT1_END_DT")
    public String getOAT1ENDDT() {
        return oAT1ENDDT;
    }

    @JsonProperty("OAT1_END_DT")
    public void setOAT1ENDDT(String oAT1ENDDT) {
        this.oAT1ENDDT = oAT1ENDDT;
    }

    @JsonProperty("OST2_EFF_DT")
    public String getOST2EFFDT() {
        return oST2EFFDT;
    }

    @JsonProperty("OST2_EFF_DT")
    public void setOST2EFFDT(String oST2EFFDT) {
        this.oST2EFFDT = oST2EFFDT;
    }

    @JsonProperty("OST2_END_DT")
    public String getOST2ENDDT() {
        return oST2ENDDT;
    }

    @JsonProperty("OST2_END_DT")
    public void setOST2ENDDT(String oST2ENDDT) {
        this.oST2ENDDT = oST2ENDDT;
    }

    @JsonProperty("OST1_EFF_DT")
    public String getOST1EFFDT() {
        return oST1EFFDT;
    }

    @JsonProperty("OST1_EFF_DT")
    public void setOST1EFFDT(String oST1EFFDT) {
        this.oST1EFFDT = oST1EFFDT;
    }

    @JsonProperty("OST1_END_DT")
    public String getOST1ENDDT() {
        return oST1ENDDT;
    }

    @JsonProperty("OST1_END_DT")
    public void setOST1ENDDT(String oST1ENDDT) {
        this.oST1ENDDT = oST1ENDDT;
    }

    @JsonProperty("OAT2_EFF_DT")
    public String getOAT2EFFDT() {
        return oAT2EFFDT;
    }

    @JsonProperty("OAT2_EFF_DT")
    public void setOAT2EFFDT(String oAT2EFFDT) {
        this.oAT2EFFDT = oAT2EFFDT;
    }

    @JsonProperty("OAT2_END_DT")
    public String getOAT2ENDDT() {
        return oAT2ENDDT;
    }

    @JsonProperty("OAT2_END_DT")
    public void setOAT2ENDDT(String oAT2ENDDT) {
        this.oAT2ENDDT = oAT2ENDDT;
    }

    @JsonProperty("TRAD_EFF_DT")
    public String getTRADEFFDT() {
        return tRADEFFDT;
    }

    @JsonProperty("TRAD_EFF_DT")
    public void setTRADEFFDT(String tRADEFFDT) {
        this.tRADEFFDT = tRADEFFDT;
    }

    @JsonProperty("TRAD_END_DT")
    public String getTRADENDDT() {
        return tRADENDDT;
    }

    @JsonProperty("TRAD_END_DT")
    public void setTRADENDDT(String tRADENDDT) {
        this.tRADENDDT = tRADENDDT;
    }

    @JsonProperty("MGCN_EFF_DT")
    public String getMGCNEFFDT() {
        return mGCNEFFDT;
    }

    @JsonProperty("MGCN_EFF_DT")
    public void setMGCNEFFDT(String mGCNEFFDT) {
        this.mGCNEFFDT = mGCNEFFDT;
    }

    @JsonProperty("MGCN_END_DT")
    public String getMGCNENDDT() {
        return mGCNENDDT;
    }

    @JsonProperty("MGCN_END_DT")
    public void setMGCNENDDT(String mGCNENDDT) {
        this.mGCNENDDT = mGCNENDDT;
    }

    @JsonProperty("MCBL_EFF_DT")
    public String getMCBLEFFDT() {
        return mCBLEFFDT;
    }

    @JsonProperty("MCBL_EFF_DT")
    public void setMCBLEFFDT(String mCBLEFFDT) {
        this.mCBLEFFDT = mCBLEFFDT;
    }

    @JsonProperty("MCBL_END_DT")
    public String getMCBLENDDT() {
        return mCBLENDDT;
    }

    @JsonProperty("MCBL_END_DT")
    public void setMCBLENDDT(String mCBLENDDT) {
        this.mCBLENDDT = mCBLENDDT;
    }

    @JsonProperty("ADVN_EFF_DT")
    public String getADVNEFFDT() {
        return aDVNEFFDT;
    }

    @JsonProperty("ADVN_EFF_DT")
    public void setADVNEFFDT(String aDVNEFFDT) {
        this.aDVNEFFDT = aDVNEFFDT;
    }

    @JsonProperty("ADVN_END_DT")
    public String getADVNENDDT() {
        return aDVNENDDT;
    }

    @JsonProperty("ADVN_END_DT")
    public void setADVNENDDT(String aDVNENDDT) {
        this.aDVNENDDT = aDVNENDDT;
    }

    @JsonProperty("ACO_EFF_DT")
    public String getACOEFFDT() {
        return aCOEFFDT;
    }

    @JsonProperty("ACO_EFF_DT")
    public void setACOEFFDT(String aCOEFFDT) {
        this.aCOEFFDT = aCOEFFDT;
    }

    @JsonProperty("ACO_END_DT")
    public String getACOENDDT() {
        return aCOENDDT;
    }

    @JsonProperty("ACO_END_DT")
    public void setACOENDDT(String aCOENDDT) {
        this.aCOENDDT = aCOENDDT;
    }

    @JsonProperty("PCMH_EFF_DT")
    public String getPCMHEFFDT() {
        return pCMHEFFDT;
    }

    @JsonProperty("PCMH_EFF_DT")
    public void setPCMHEFFDT(String pCMHEFFDT) {
        this.pCMHEFFDT = pCMHEFFDT;
    }

    @JsonProperty("PCMH_END_DT")
    public String getPCMHENDDT() {
        return pCMHENDDT;
    }

    @JsonProperty("PCMH_END_DT")
    public void setPCMHENDDT(String pCMHENDDT) {
        this.pCMHENDDT = pCMHENDDT;
    }

    @JsonProperty("MBPC_EFF_DT")
    public String getMBPCEFFDT() {
        return mBPCEFFDT;
    }

    @JsonProperty("MBPC_EFF_DT")
    public void setMBPCEFFDT(String mBPCEFFDT) {
        this.mBPCEFFDT = mBPCEFFDT;
    }

    @JsonProperty("MBPC_END_DT")
    public String getMBPCENDDT() {
        return mBPCENDDT;
    }

    @JsonProperty("MBPC_END_DT")
    public void setMBPCENDDT(String mBPCENDDT) {
        this.mBPCENDDT = mBPCENDDT;
    }

    @JsonProperty("SHMC_EFF_DT")
    public String getSHMCEFFDT() {
        return sHMCEFFDT;
    }

    @JsonProperty("SHMC_EFF_DT")
    public void setSHMCEFFDT(String sHMCEFFDT) {
        this.sHMCEFFDT = sHMCEFFDT;
    }

    @JsonProperty("SHMC_END_DT")
    public String getSHMCENDDT() {
        return sHMCENDDT;
    }

    @JsonProperty("SHMC_END_DT")
    public void setSHMCENDDT(String sHMCENDDT) {
        this.sHMCENDDT = sHMCENDDT;
    }

    @JsonProperty("RWJB")
    public String getRWJB() {
        return rWJB;
    }

    @JsonProperty("RWJB")
    public void setRWJB(String rWJB) {
        this.rWJB = rWJB;
    }

    @JsonProperty("RWJB_EFF_DT")
    public String getRWJBEFFDT() {
        return rWJBEFFDT;
    }

    @JsonProperty("RWJB_EFF_DT")
    public void setRWJBEFFDT(String rWJBEFFDT) {
        this.rWJBEFFDT = rWJBEFFDT;
    }

    @JsonProperty("RWJB_END_DT")
    public String getRWJBENDDT() {
        return rWJBENDDT;
    }

    @JsonProperty("RWJB_END_DT")
    public void setRWJBENDDT(String rWJBENDDT) {
        this.rWJBENDDT = rWJBENDDT;
    }

    @JsonProperty("MBAV")
    public String getMBAV() {
        return mBAV;
    }

    @JsonProperty("MBAV")
    public void setMBAV(String mBAV) {
        this.mBAV = mBAV;
    }

    @JsonProperty("MBAV_EFF_DT")
    public String getMBAVEFFDT() {
        return mBAVEFFDT;
    }

    @JsonProperty("MBAV_EFF_DT")
    public void setMBAVEFFDT(String mBAVEFFDT) {
        this.mBAVEFFDT = mBAVEFFDT;
    }

    @JsonProperty("MBAV_END_DT")
    public String getMBAVENDDT() {
        return mBAVENDDT;
    }

    @JsonProperty("MBAV_END_DT")
    public void setMBAVENDDT(String mBAVENDDT) {
        this.mBAVENDDT = mBAVENDDT;
    }

    @JsonProperty("HMIC")
    public String getHMIC() {
        return hMIC;
    }

    @JsonProperty("HMIC")
    public void setHMIC(String hMIC) {
        this.hMIC = hMIC;
    }

    @JsonProperty("HMIC_EFF_DT")
    public String getHMICEFFDT() {
        return hMICEFFDT;
    }

    @JsonProperty("HMIC_EFF_DT")
    public void setHMICEFFDT(String hMICEFFDT) {
        this.hMICEFFDT = hMICEFFDT;
    }

    @JsonProperty("HMIC_END_DT")
    public String getHMICENDDT() {
        return hMICENDDT;
    }

    @JsonProperty("HMIC_END_DT")
    public void setHMICENDDT(String hMICENDDT) {
        this.hMICENDDT = hMICENDDT;
    }

    @JsonProperty("INSP")
    public String getINSP() {
        return iNSP;
    }

    @JsonProperty("INSP")
    public void setINSP(String iNSP) {
        this.iNSP = iNSP;
    }

    @JsonProperty("INSP_EFF_DT")
    public String getINSPEFFDT() {
        return iNSPEFFDT;
    }

    @JsonProperty("INSP_EFF_DT")
    public void setINSPEFFDT(String iNSPEFFDT) {
        this.iNSPEFFDT = iNSPEFFDT;
    }

    @JsonProperty("INSP_END_DT")
    public String getINSPENDDT() {
        return iNSPENDDT;
    }

    @JsonProperty("INSP_END_DT")
    public void setINSPENDDT(String iNSPENDDT) {
        this.iNSPENDDT = iNSPENDDT;
    }

    @JsonProperty("TRNT")
    public String getTRNT() {
        return tRNT;
    }

    @JsonProperty("TRNT")
    public void setTRNT(String tRNT) {
        this.tRNT = tRNT;
    }

    @JsonProperty("TRNT_EFF_DT")
    public String getTRNTEFFDT() {
        return tRNTEFFDT;
    }

    @JsonProperty("TRNT_EFF_DT")
    public void setTRNTEFFDT(String tRNTEFFDT) {
        this.tRNTEFFDT = tRNTEFFDT;
    }

    @JsonProperty("TRNT_END_DT")
    public String getTRNTENDDT() {
        return tRNTENDDT;
    }

    @JsonProperty("TRNT_END_DT")
    public void setTRNTENDDT(String tRNTENDDT) {
        this.tRNTENDDT = tRNTENDDT;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
