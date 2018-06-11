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
import com.horizon.dde.app.Formatter.BaseFormatter;
import com.horizon.dde.app.annotation.DDEFormat;

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
    "degree",
    "jcode",
    "nasco",
    "note",
    "jcode_panel_status",
    "jcode_panel_code",
    "language",
    "ssn",
    "taxid",
    "county",
    "dataid",
    "product_specialty_hospital",
    "mgcn",
    "trad",
    "stny",
    "njpl",
    "mcbl",
    "hdtc",
    "hddc",
    "hddp",
    "hddt",
    "mcny",
    "vstany",
    "nyep",
    "nypp",
    "advn",
    "aco",
    "pcmh",
    "male",
    "female",
    "mon_open1",
    "mon_close1",
    "mon_open2",
    "mon_close2",
    "tue_open1",
    "tue_close1",
    "tue_open2",
    "tue_close2",
    "wed_open1",
    "wed_close1",
    "wed_open2",
    "wed_close2",
    "thu_open1",
    "thu_close1",
    "thu_open2",
    "thu_close2",
    "fri_open1",
    "fri_close1",
    "fri_open2",
    "fri_close2",
    "sat_open1",
    "sat_close1",
    "sat_open2",
    "sat_close2",
    "sun_open1",
    "sun_close1",
    "sun_open2",
    "sun_close2",
    "nationalproviderid",
    "net_start_date",
    "dmax",
    "lucent",
    "offcode",
    "anctest",
    "hospcode",
    "hosp",
    "rpq",
    "horizon_dental_epo",
    "board_certified",
    "specialty",
    "latitude",
    "longitude",
    "ehr",
    "qrp",
    "ncqa",
    "hnjh_ind",
    "practice_limitation",
    "acpt_new_pat",
    "mcr_rating",
    "mbpc",
    "shmc",
    "ccx",
    "omt1",
    "omt2",
    "oat1",
    "ost2",
    "ost1",
    "oat2",
    "omt1_eff_dt",
    "omt1_end_dt",
    "omt2_eff_dt",
    "omt2_end_dt",
    "oat1_eff_dt",
    "oat1_end_dt",
    "ost2_eff_dt",
    "ost2_end_dt",
    "ost1_eff_dt",
    "ost1_end_dt",
    "oat2_eff_dt",
    "oat2_end_dt",
    "trad_eff_dt",
    "trad_end_dt",
    "mgcn_eff_dt",
    "mgcn_end_dt",
    "mcbl_eff_dt",
    "mcbl_end_dt",
    "advn_eff_dt",
    "advn_end_dt",
    "aco_eff_dt",
    "aco_end_dt",
    "pcmh_eff_dt",
    "pcmh_end_dt",
    "mbpc_eff_dt",
    "mbpc_end_dt",
    "shmc_eff_dt",
    "shmc_end_dt",
    "rwjb",
    "rwjb_eff_dt",
    "rwjb_end_dt",
    "mbav",
    "mbav_eff_dt",
    "mbav_end_dt",
    "hmic",
    "hmic_eff_dt",
    "hmic_end_dt",
    "insp",
    "insp_eff_dt",
    "insp_end_dt",
    "trnt",
    "trnt_eff_dt",
    "trnt_end_dt"
})
public class MDMCommercialModel extends AbstractDDEModel implements Serializable
{

    @JsonProperty("type")
    @DDEFormat(formatterType = BaseFormatter.class ,formatterMethod = "formatClean")
    private String tYPE;
    @DDEFormat(formatterType = BaseFormatter.class ,formatterMethod = "formatGender")
    @JsonProperty("bid")
    private String bID;
    @JsonProperty("group_name")
    private String gROUPNAME;
    @JsonProperty("name")
    private String nAME;
    @JsonProperty("address1")
    private String aDDRESS1;
    @JsonProperty("city")
    private String cITY;
    @JsonProperty("state")
    private String sTATE;
    @JsonProperty("zipcode")
    private String zIPCODE;
    @JsonProperty("phone")
    private String pHONE;
    @JsonProperty("fax")
    private String fAX;
    @JsonProperty("lastname")
    private String lASTNAME;
    @JsonProperty("firstname")
    @DDEFormat(formatterType = BaseFormatter.class ,formatterMethod = "formatClean")
    private String fIRSTNAME;
    @JsonProperty("mi")
    private String mI;
    @JsonProperty("degree")
    private String dEGREE;
    @JsonProperty("jcode")
    private String jCode;
    @JsonProperty("nasco")
    private String nASCO;
    @JsonProperty("note")
    private String nOTE;
    @JsonProperty("jcode_panel_status")
    private String jCODEPANELSTATUS;
    @JsonProperty("jcode_panel_code")
    private String jCODEPANELCODE;
    @JsonProperty("language")
    private String lANGUAGE;
    @JsonProperty("ssn")
    private String sSN;
    @JsonProperty("taxid")
    private String tAXID;
    @JsonProperty("county")
    private String cOUNTY;
    @JsonProperty("dataid")
    private String dataID;
    @JsonProperty("product_specialty_hospital")
    private String pRODUCTSPECIALTYHOSPITAL;
    @JsonProperty("mgcn")
    private String mGCN;
    @JsonProperty("trad")
    private String tRAD;
    @JsonProperty("stny")
    private String sTNY;
    @JsonProperty("njpl")
    private String nJPL;
    @JsonProperty("mcbl")
    private String mCBL;
    @JsonProperty("hdtc")
    private String hDTC;
    @JsonProperty("hddc")
    private String hDDC;
    @JsonProperty("hddp")
    private String hDDP;
    @JsonProperty("hddt")
    private String hDDT;
    @JsonProperty("mcny")
    private String mCNY;
    @JsonProperty("vstany")
    private String vSTANY;
    @JsonProperty("nyep")
    private String nYEP;
    @JsonProperty("nypp")
    private String nYPP;
    @JsonProperty("advn")
    private String aDVN;
    @JsonProperty("aco")
    private String aCO;
    @JsonProperty("pcmh")
    private String pCMH;
    @JsonProperty("male")
    private String mALE;
    @JsonProperty("female")
    private String fEMALE;
    @JsonProperty("mon_open1")
    private String monOpen1;
    @JsonProperty("mon_close1")
    private String monClose1;
    @JsonProperty("mon_open2")
    private String monOpen2;
    @JsonProperty("mon_close2")
    private String monClose2;
    @JsonProperty("tue_open1")
    private String tueOpen1;
    @JsonProperty("tue_close1")
    private String tueClose1;
    @JsonProperty("tue_open2")
    private String tueOpen2;
    @JsonProperty("tue_close2")
    private String tueClose2;
    @JsonProperty("wed_open1")
    private String wedOpen1;
    @JsonProperty("wed_close1")
    private String wedClose1;
    @JsonProperty("wed_open2")
    private String wedOpen2;
    @JsonProperty("wed_close2")
    private String wedClose2;
    @JsonProperty("thu_open1")
    private String thuOpen1;
    @JsonProperty("thu_close1")
    private String thuClose1;
    @JsonProperty("thu_open2")
    private String thuOpen2;
    @JsonProperty("thu_close2")
    private String thuClose2;
    @JsonProperty("fri_open1")
    private String friOpen1;
    @JsonProperty("fri_close1")
    private String friClose1;
    @JsonProperty("fri_open2")
    private String friOpen2;
    @JsonProperty("fri_close2")
    private String friClose2;
    @JsonProperty("sat_open1")
    private String satOpen1;
    @JsonProperty("sat_close1")
    private String satClose1;
    @JsonProperty("sat_open2")
    private String satOpen2;
    @JsonProperty("sat_close2")
    private String satClose2;
    @JsonProperty("sun_open1")
    private String sunOpen1;
    @JsonProperty("sun_close1")
    private String sunClose1;
    @JsonProperty("sun_open2")
    private String sunOpen2;
    @JsonProperty("sun_close2")
    private String sunClose2;
    @JsonProperty("nationalproviderid")
    private String nATIONALPROVIDERID;
    @JsonProperty("net_start_date")
    private String nETSTARTDATE;
    @JsonProperty("dmax")
    private String dMAX;
    @JsonProperty("lucent")
    private String lUCENT;
    @JsonProperty("offcode")
    private String oFFCODE;
    @JsonProperty("anctest")
    private String aNCTEST;
    @JsonProperty("hospcode")
    private String hOSPCODE;
    @JsonProperty("hosp")
    private String hOSP;
    @JsonProperty("rpq")
    private String rPQ;
    @JsonProperty("horizon_dental_epo")
    private String hORIZONDENTALEPO;
    @JsonProperty("board_certified")
    private String bOARDCERTIFIED;
    @JsonProperty("specialty")
    private String sPECIALTY;
    @JsonProperty("latitude")
    private String lATITUDE;
    @JsonProperty("longitude")
    private String lONGITUDE;
    @JsonProperty("ehr")
    private String eHR;
    @JsonProperty("qrp")
    private String qRP;
    @JsonProperty("ncqa")
    private String nCQA;
    @JsonProperty("hnjh_ind")
    private String hNJHIND;
    @JsonProperty("practice_limitation")
    private String pRACTICELIMITATION;
    @JsonProperty("acpt_new_pat")
    private String aCPTNEWPAT;
    @JsonProperty("mcr_rating")
    private String mCRRATING;
    @JsonProperty("mbpc")
    private String mBPC;
    @JsonProperty("shmc")
    private String sHMC;
    @JsonProperty("ccx")
    private String cCX;
    @JsonProperty("omt1")
    private String oMT1;
    @JsonProperty("omt2")
    private String oMT2;
    @JsonProperty("oat1")
    private String oAT1;
    @JsonProperty("ost2")
    private String oST2;
    @JsonProperty("ost1")
    private String oST1;
    @JsonProperty("oat2")
    private String oAT2;
    @JsonProperty("omt1_eff_dt")
    private String oMT1EFFDT;
    @JsonProperty("omt1_end_dt")
    private String oMT1ENDDT;
    @JsonProperty("omt2_eff_dt")
    private String oMT2EFFDT;
    @JsonProperty("omt2_end_dt")
    private String oMT2ENDDT;
    @JsonProperty("oat1_eff_dt")
    private String oAT1EFFDT;
    @JsonProperty("oat1_end_dt")
    private String oAT1ENDDT;
    @JsonProperty("ost2_eff_dt")
    private String oST2EFFDT;
    @JsonProperty("ost2_end_dt")
    private String oST2ENDDT;
    @JsonProperty("ost1_eff_dt")
    private String oST1EFFDT;
    @JsonProperty("ost1_end_dt")
    private String oST1ENDDT;
    @JsonProperty("oat2_eff_dt")
    private String oAT2EFFDT;
    @JsonProperty("oat2_end_dt")
    private String oAT2ENDDT;
    @JsonProperty("trad_eff_dt")
    private String tRADEFFDT;
    @JsonProperty("trad_end_dt")
    private String tRADENDDT;
    @JsonProperty("mgcn_eff_dt")
    private String mGCNEFFDT;
    @JsonProperty("mgcn_end_dt")
    private String mGCNENDDT;
    @JsonProperty("mcbl_eff_dt")
    private String mCBLEFFDT;
    @JsonProperty("mcbl_end_dt")
    private String mCBLENDDT;
    @JsonProperty("advn_eff_dt")
    private String aDVNEFFDT;
    @JsonProperty("advn_end_dt")
    private String aDVNENDDT;
    @JsonProperty("aco_eff_dt")
    private String aCOEFFDT;
    @JsonProperty("aco_end_dt")
    private String aCOENDDT;
    @JsonProperty("pcmh_eff_dt")
    private String pCMHEFFDT;
    @JsonProperty("pcmh_end_dt")
    private String pCMHENDDT;
    @JsonProperty("mbpc_eff_dt")
    private String mBPCEFFDT;
    @JsonProperty("mbpc_end_dt")
    private String mBPCENDDT;
    @JsonProperty("shmc_eff_dt")
    private String sHMCEFFDT;
    @JsonProperty("shmc_end_dt")
    private String sHMCENDDT;
    @JsonProperty("rwjb")
    private String rWJB;
    @JsonProperty("rwjb_eff_dt")
    private String rWJBEFFDT;
    @JsonProperty("rwjb_end_dt")
    private String rWJBENDDT;
    @JsonProperty("mbav")
    private String mBAV;
    @JsonProperty("mbav_eff_dt")
    private String mBAVEFFDT;
    @JsonProperty("mbav_end_dt")
    private String mBAVENDDT;
    @JsonProperty("hmic")
    private String hMIC;
    @JsonProperty("hmic_eff_dt")
    private String hMICEFFDT;
    @JsonProperty("hmic_end_dt")
    private String hMICENDDT;
    @JsonProperty("insp")
    private String iNSP;
    @JsonProperty("insp_eff_dt")
    private String iNSPEFFDT;
    @JsonProperty("insp_end_dt")
    private String iNSPENDDT;
    @JsonProperty("trnt")
    private String tRNT;
    @JsonProperty("trnt_eff_dt")
    private String tRNTEFFDT;
    @JsonProperty("trnt_end_dt")
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

    @JsonProperty("group_name")
    public String getGROUPNAME() {
        return gROUPNAME;
    }

    @JsonProperty("group_name")
    public void setGROUPNAME(String gROUPNAME) {
        this.gROUPNAME = gROUPNAME;
    }

    @JsonProperty("name")
    public String getNAME() {
        return nAME;
    }

    @JsonProperty("name")
    public void setNAME(String nAME) {
        this.nAME = nAME;
    }

    @JsonProperty("address1")
    public String getADDRESS1() {
        return aDDRESS1;
    }

    @JsonProperty("address1")
    public void setADDRESS1(String aDDRESS1) {
        this.aDDRESS1 = aDDRESS1;
    }

    @JsonProperty("city")
    public String getCITY() {
        return cITY;
    }

    @JsonProperty("city")
    public void setCITY(String cITY) {
        this.cITY = cITY;
    }

    @JsonProperty("state")
    public String getSTATE() {
        return sTATE;
    }

    @JsonProperty("state")
    public void setSTATE(String sTATE) {
        this.sTATE = sTATE;
    }

    @JsonProperty("zipcode")
    public String getZIPCODE() {
        return zIPCODE;
    }

    @JsonProperty("zipcode")
    public void setZIPCODE(String zIPCODE) {
        this.zIPCODE = zIPCODE;
    }

    @JsonProperty("phone")
    public String getPHONE() {
        return pHONE;
    }

    @JsonProperty("phone")
    public void setPHONE(String pHONE) {
        this.pHONE = pHONE;
    }

    @JsonProperty("fax")
    public String getFAX() {
        return fAX;
    }

    @JsonProperty("fax")
    public void setFAX(String fAX) {
        this.fAX = fAX;
    }

    @JsonProperty("lastname")
    public String getLASTNAME() {
        return lASTNAME;
    }

    @JsonProperty("lastname")
    public void setLASTNAME(String lASTNAME) {
        this.lASTNAME = lASTNAME;
    }

    @JsonProperty("firstname")
    public String getFIRSTNAME() {
        return fIRSTNAME;
    }

    @JsonProperty("firstname")
    public void setFIRSTNAME(String fIRSTNAME) {
        this.fIRSTNAME = fIRSTNAME;
    }

    @JsonProperty("mi")
    public String getMI() {
        return mI;
    }

    @JsonProperty("mi")
    public void setMI(String mI) {
        this.mI = mI;
    }

    @JsonProperty("degree")
    public String getDEGREE() {
        return dEGREE;
    }

    @JsonProperty("degree")
    public void setDEGREE(String dEGREE) {
        this.dEGREE = dEGREE;
    }

    @JsonProperty("jcode")
    public String getJCode() {
        return jCode;
    }

    @JsonProperty("jcode")
    public void setJCode(String jCode) {
        this.jCode = jCode;
    }

    @JsonProperty("nasco")
    public String getNASCO() {
        return nASCO;
    }

    @JsonProperty("nasco")
    public void setNASCO(String nASCO) {
        this.nASCO = nASCO;
    }

    @JsonProperty("note")
    public String getNOTE() {
        return nOTE;
    }

    @JsonProperty("note")
    public void setNOTE(String nOTE) {
        this.nOTE = nOTE;
    }

    @JsonProperty("jcode_panel_status")
    public String getJCODEPANELSTATUS() {
        return jCODEPANELSTATUS;
    }

    @JsonProperty("jcode_panel_status")
    public void setJCODEPANELSTATUS(String jCODEPANELSTATUS) {
        this.jCODEPANELSTATUS = jCODEPANELSTATUS;
    }

    @JsonProperty("jcode_panel_code")
    public String getJCODEPANELCODE() {
        return jCODEPANELCODE;
    }

    @JsonProperty("jcode_panel_code")
    public void setJCODEPANELCODE(String jCODEPANELCODE) {
        this.jCODEPANELCODE = jCODEPANELCODE;
    }

    @JsonProperty("language")
    public String getLANGUAGE() {
        return lANGUAGE;
    }

    @JsonProperty("language")
    public void setLANGUAGE(String lANGUAGE) {
        this.lANGUAGE = lANGUAGE;
    }

    @JsonProperty("ssn")
    public String getSSN() {
        return sSN;
    }

    @JsonProperty("ssn")
    public void setSSN(String sSN) {
        this.sSN = sSN;
    }

    @JsonProperty("taxid")
    public String getTAXID() {
        return tAXID;
    }

    @JsonProperty("taxid")
    public void setTAXID(String tAXID) {
        this.tAXID = tAXID;
    }

    @JsonProperty("county")
    public String getCOUNTY() {
        return cOUNTY;
    }

    @JsonProperty("county")
    public void setCOUNTY(String cOUNTY) {
        this.cOUNTY = cOUNTY;
    }

    @JsonProperty("dataid")
    public String getDataID() {
        return dataID;
    }

    @JsonProperty("dataid")
    public void setDataID(String dataID) {
        this.dataID = dataID;
    }

    @JsonProperty("product_specialty_hospital")
    public String getPRODUCTSPECIALTYHOSPITAL() {
        return pRODUCTSPECIALTYHOSPITAL;
    }

    @JsonProperty("product_specialty_hospital")
    public void setPRODUCTSPECIALTYHOSPITAL(String pRODUCTSPECIALTYHOSPITAL) {
        this.pRODUCTSPECIALTYHOSPITAL = pRODUCTSPECIALTYHOSPITAL;
    }

    @JsonProperty("mgcn")
    public String getMGCN() {
        return mGCN;
    }

    @JsonProperty("mgcn")
    public void setMGCN(String mGCN) {
        this.mGCN = mGCN;
    }

    @JsonProperty("trad")
    public String getTRAD() {
        return tRAD;
    }

    @JsonProperty("trad")
    public void setTRAD(String tRAD) {
        this.tRAD = tRAD;
    }

    @JsonProperty("stny")
    public String getSTNY() {
        return sTNY;
    }

    @JsonProperty("stny")
    public void setSTNY(String sTNY) {
        this.sTNY = sTNY;
    }

    @JsonProperty("njpl")
    public String getNJPL() {
        return nJPL;
    }

    @JsonProperty("njpl")
    public void setNJPL(String nJPL) {
        this.nJPL = nJPL;
    }

    @JsonProperty("mcbl")
    public String getMCBL() {
        return mCBL;
    }

    @JsonProperty("mcbl")
    public void setMCBL(String mCBL) {
        this.mCBL = mCBL;
    }

    @JsonProperty("hdtc")
    public String getHDTC() {
        return hDTC;
    }

    @JsonProperty("hdtc")
    public void setHDTC(String hDTC) {
        this.hDTC = hDTC;
    }

    @JsonProperty("hddc")
    public String getHDDC() {
        return hDDC;
    }

    @JsonProperty("hddc")
    public void setHDDC(String hDDC) {
        this.hDDC = hDDC;
    }

    @JsonProperty("hddp")
    public String getHDDP() {
        return hDDP;
    }

    @JsonProperty("hddp")
    public void setHDDP(String hDDP) {
        this.hDDP = hDDP;
    }

    @JsonProperty("hddt")
    public String getHDDT() {
        return hDDT;
    }

    @JsonProperty("hddt")
    public void setHDDT(String hDDT) {
        this.hDDT = hDDT;
    }

    @JsonProperty("mcny")
    public String getMCNY() {
        return mCNY;
    }

    @JsonProperty("mcny")
    public void setMCNY(String mCNY) {
        this.mCNY = mCNY;
    }

    @JsonProperty("vstany")
    public String getVSTANY() {
        return vSTANY;
    }

    @JsonProperty("vstany")
    public void setVSTANY(String vSTANY) {
        this.vSTANY = vSTANY;
    }

    @JsonProperty("nyep")
    public String getNYEP() {
        return nYEP;
    }

    @JsonProperty("nyep")
    public void setNYEP(String nYEP) {
        this.nYEP = nYEP;
    }

    @JsonProperty("nypp")
    public String getNYPP() {
        return nYPP;
    }

    @JsonProperty("nypp")
    public void setNYPP(String nYPP) {
        this.nYPP = nYPP;
    }

    @JsonProperty("advn")
    public String getADVN() {
        return aDVN;
    }

    @JsonProperty("advn")
    public void setADVN(String aDVN) {
        this.aDVN = aDVN;
    }

    @JsonProperty("aco")
    public String getACO() {
        return aCO;
    }

    @JsonProperty("aco")
    public void setACO(String aCO) {
        this.aCO = aCO;
    }

    @JsonProperty("pcmh")
    public String getPCMH() {
        return pCMH;
    }

    @JsonProperty("pcmh")
    public void setPCMH(String pCMH) {
        this.pCMH = pCMH;
    }

    @JsonProperty("male")
    public String getMALE() {
        return mALE;
    }

    @JsonProperty("male")
    public void setMALE(String mALE) {
        this.mALE = mALE;
    }

    @JsonProperty("female")
    public String getFEMALE() {
        return fEMALE;
    }

    @JsonProperty("female")
    public void setFEMALE(String fEMALE) {
        this.fEMALE = fEMALE;
    }

    @JsonProperty("mon_open1")
    public String getMonOpen1() {
        return monOpen1;
    }

    @JsonProperty("mon_open1")
    public void setMonOpen1(String monOpen1) {
        this.monOpen1 = monOpen1;
    }

    @JsonProperty("mon_close1")
    public String getMonClose1() {
        return monClose1;
    }

    @JsonProperty("mon_close1")
    public void setMonClose1(String monClose1) {
        this.monClose1 = monClose1;
    }

    @JsonProperty("mon_open2")
    public String getMonOpen2() {
        return monOpen2;
    }

    @JsonProperty("mon_open2")
    public void setMonOpen2(String monOpen2) {
        this.monOpen2 = monOpen2;
    }

    @JsonProperty("mon_close2")
    public String getMonClose2() {
        return monClose2;
    }

    @JsonProperty("mon_close2")
    public void setMonClose2(String monClose2) {
        this.monClose2 = monClose2;
    }

    @JsonProperty("tue_open1")
    public String getTueOpen1() {
        return tueOpen1;
    }

    @JsonProperty("tue_open1")
    public void setTueOpen1(String tueOpen1) {
        this.tueOpen1 = tueOpen1;
    }

    @JsonProperty("tue_close1")
    public String getTueClose1() {
        return tueClose1;
    }

    @JsonProperty("tue_close1")
    public void setTueClose1(String tueClose1) {
        this.tueClose1 = tueClose1;
    }

    @JsonProperty("tue_open2")
    public String getTueOpen2() {
        return tueOpen2;
    }

    @JsonProperty("tue_open2")
    public void setTueOpen2(String tueOpen2) {
        this.tueOpen2 = tueOpen2;
    }

    @JsonProperty("tue_close2")
    public String getTueClose2() {
        return tueClose2;
    }

    @JsonProperty("tue_close2")
    public void setTueClose2(String tueClose2) {
        this.tueClose2 = tueClose2;
    }

    @JsonProperty("wed_open1")
    public String getWedOpen1() {
        return wedOpen1;
    }

    @JsonProperty("wed_open1")
    public void setWedOpen1(String wedOpen1) {
        this.wedOpen1 = wedOpen1;
    }

    @JsonProperty("wed_close1")
    public String getWedClose1() {
        return wedClose1;
    }

    @JsonProperty("wed_close1")
    public void setWedClose1(String wedClose1) {
        this.wedClose1 = wedClose1;
    }

    @JsonProperty("wed_open2")
    public String getWedOpen2() {
        return wedOpen2;
    }

    @JsonProperty("wed_open2")
    public void setWedOpen2(String wedOpen2) {
        this.wedOpen2 = wedOpen2;
    }

    @JsonProperty("wed_close2")
    public String getWedClose2() {
        return wedClose2;
    }

    @JsonProperty("wed_close2")
    public void setWedClose2(String wedClose2) {
        this.wedClose2 = wedClose2;
    }

    @JsonProperty("thu_open1")
    public String getThuOpen1() {
        return thuOpen1;
    }

    @JsonProperty("thu_open1")
    public void setThuOpen1(String thuOpen1) {
        this.thuOpen1 = thuOpen1;
    }

    @JsonProperty("thu_close1")
    public String getThuClose1() {
        return thuClose1;
    }

    @JsonProperty("thu_close1")
    public void setThuClose1(String thuClose1) {
        this.thuClose1 = thuClose1;
    }

    @JsonProperty("thu_open2")
    public String getThuOpen2() {
        return thuOpen2;
    }

    @JsonProperty("thu_open2")
    public void setThuOpen2(String thuOpen2) {
        this.thuOpen2 = thuOpen2;
    }

    @JsonProperty("thu_close2")
    public String getThuClose2() {
        return thuClose2;
    }

    @JsonProperty("thu_close2")
    public void setThuClose2(String thuClose2) {
        this.thuClose2 = thuClose2;
    }

    @JsonProperty("fri_open1")
    public String getFriOpen1() {
        return friOpen1;
    }

    @JsonProperty("fri_open1")
    public void setFriOpen1(String friOpen1) {
        this.friOpen1 = friOpen1;
    }

    @JsonProperty("fri_close1")
    public String getFriClose1() {
        return friClose1;
    }

    @JsonProperty("fri_close1")
    public void setFriClose1(String friClose1) {
        this.friClose1 = friClose1;
    }

    @JsonProperty("fri_open2")
    public String getFriOpen2() {
        return friOpen2;
    }

    @JsonProperty("fri_open2")
    public void setFriOpen2(String friOpen2) {
        this.friOpen2 = friOpen2;
    }

    @JsonProperty("fri_close2")
    public String getFriClose2() {
        return friClose2;
    }

    @JsonProperty("fri_close2")
    public void setFriClose2(String friClose2) {
        this.friClose2 = friClose2;
    }

    @JsonProperty("sat_open1")
    public String getSatOpen1() {
        return satOpen1;
    }

    @JsonProperty("sat_open1")
    public void setSatOpen1(String satOpen1) {
        this.satOpen1 = satOpen1;
    }

    @JsonProperty("sat_close1")
    public String getSatClose1() {
        return satClose1;
    }

    @JsonProperty("sat_close1")
    public void setSatClose1(String satClose1) {
        this.satClose1 = satClose1;
    }

    @JsonProperty("sat_open2")
    public String getSatOpen2() {
        return satOpen2;
    }

    @JsonProperty("sat_open2")
    public void setSatOpen2(String satOpen2) {
        this.satOpen2 = satOpen2;
    }

    @JsonProperty("sat_close2")
    public String getSatClose2() {
        return satClose2;
    }

    @JsonProperty("sat_close2")
    public void setSatClose2(String satClose2) {
        this.satClose2 = satClose2;
    }

    @JsonProperty("sun_open1")
    public String getSunOpen1() {
        return sunOpen1;
    }

    @JsonProperty("sun_open1")
    public void setSunOpen1(String sunOpen1) {
        this.sunOpen1 = sunOpen1;
    }

    @JsonProperty("sun_close1")
    public String getSunClose1() {
        return sunClose1;
    }

    @JsonProperty("sun_close1")
    public void setSunClose1(String sunClose1) {
        this.sunClose1 = sunClose1;
    }

    @JsonProperty("sun_open2")
    public String getSunOpen2() {
        return sunOpen2;
    }

    @JsonProperty("sun_open2")
    public void setSunOpen2(String sunOpen2) {
        this.sunOpen2 = sunOpen2;
    }

    @JsonProperty("sun_close2")
    public String getSunClose2() {
        return sunClose2;
    }

    @JsonProperty("sun_close2")
    public void setSunClose2(String sunClose2) {
        this.sunClose2 = sunClose2;
    }

    @JsonProperty("nationalproviderid")
    public String getNATIONALPROVIDERID() {
        return nATIONALPROVIDERID;
    }

    @JsonProperty("nationalproviderid")
    public void setNATIONALPROVIDERID(String nATIONALPROVIDERID) {
        this.nATIONALPROVIDERID = nATIONALPROVIDERID;
    }

    @JsonProperty("net_start_date")
    public String getNETSTARTDATE() {
        return nETSTARTDATE;
    }

    @JsonProperty("net_start_date")
    public void setNETSTARTDATE(String nETSTARTDATE) {
        this.nETSTARTDATE = nETSTARTDATE;
    }

    @JsonProperty("dmax")
    public String getDMAX() {
        return dMAX;
    }

    @JsonProperty("dmax")
    public void setDMAX(String dMAX) {
        this.dMAX = dMAX;
    }

    @JsonProperty("lucent")
    public String getLUCENT() {
        return lUCENT;
    }

    @JsonProperty("lucent")
    public void setLUCENT(String lUCENT) {
        this.lUCENT = lUCENT;
    }

    @JsonProperty("offcode")
    public String getOFFCODE() {
        return oFFCODE;
    }

    @JsonProperty("offcode")
    public void setOFFCODE(String oFFCODE) {
        this.oFFCODE = oFFCODE;
    }

    @JsonProperty("anctest")
    public String getANCTEST() {
        return aNCTEST;
    }

    @JsonProperty("anctest")
    public void setANCTEST(String aNCTEST) {
        this.aNCTEST = aNCTEST;
    }

    @JsonProperty("hospcode")
    public String getHOSPCODE() {
        return hOSPCODE;
    }

    @JsonProperty("hospcode")
    public void setHOSPCODE(String hOSPCODE) {
        this.hOSPCODE = hOSPCODE;
    }

    @JsonProperty("hosp")
    public String getHOSP() {
        return hOSP;
    }

    @JsonProperty("hosp")
    public void setHOSP(String hOSP) {
        this.hOSP = hOSP;
    }

    @JsonProperty("rpq")
    public String getRPQ() {
        return rPQ;
    }

    @JsonProperty("rpq")
    public void setRPQ(String rPQ) {
        this.rPQ = rPQ;
    }

    @JsonProperty("horizon_dental_epo")
    public String getHORIZONDENTALEPO() {
        return hORIZONDENTALEPO;
    }

    @JsonProperty("horizon_dental_epo")
    public void setHORIZONDENTALEPO(String hORIZONDENTALEPO) {
        this.hORIZONDENTALEPO = hORIZONDENTALEPO;
    }

    @JsonProperty("board_certified")
    public String getBOARDCERTIFIED() {
        return bOARDCERTIFIED;
    }

    @JsonProperty("board_certified")
    public void setBOARDCERTIFIED(String bOARDCERTIFIED) {
        this.bOARDCERTIFIED = bOARDCERTIFIED;
    }

    @JsonProperty("specialty")
    public String getSPECIALTY() {
        return sPECIALTY;
    }

    @JsonProperty("specialty")
    public void setSPECIALTY(String sPECIALTY) {
        this.sPECIALTY = sPECIALTY;
    }

    @JsonProperty("latitude")
    public String getLATITUDE() {
        return lATITUDE;
    }

    @JsonProperty("latitude")
    public void setLATITUDE(String lATITUDE) {
        this.lATITUDE = lATITUDE;
    }

    @JsonProperty("longitude")
    public String getLONGITUDE() {
        return lONGITUDE;
    }

    @JsonProperty("longitude")
    public void setLONGITUDE(String lONGITUDE) {
        this.lONGITUDE = lONGITUDE;
    }

    @JsonProperty("ehr")
    public String getEHR() {
        return eHR;
    }

    @JsonProperty("ehr")
    public void setEHR(String eHR) {
        this.eHR = eHR;
    }

    @JsonProperty("qrp")
    public String getQRP() {
        return qRP;
    }

    @JsonProperty("qrp")
    public void setQRP(String qRP) {
        this.qRP = qRP;
    }

    @JsonProperty("ncqa")
    public String getNCQA() {
        return nCQA;
    }

    @JsonProperty("ncqa")
    public void setNCQA(String nCQA) {
        this.nCQA = nCQA;
    }

    @JsonProperty("hnjh_ind")
    public String getHNJHIND() {
        return hNJHIND;
    }

    @JsonProperty("hnjh_ind")
    public void setHNJHIND(String hNJHIND) {
        this.hNJHIND = hNJHIND;
    }

    @JsonProperty("practice_limitation")
    public String getPRACTICELIMITATION() {
        return pRACTICELIMITATION;
    }

    @JsonProperty("practice_limitation")
    public void setPRACTICELIMITATION(String pRACTICELIMITATION) {
        this.pRACTICELIMITATION = pRACTICELIMITATION;
    }

    @JsonProperty("acpt_new_pat")
    public String getACPTNEWPAT() {
        return aCPTNEWPAT;
    }

    @JsonProperty("acpt_new_pat")
    public void setACPTNEWPAT(String aCPTNEWPAT) {
        this.aCPTNEWPAT = aCPTNEWPAT;
    }

    @JsonProperty("mcr_rating")
    public String getMCRRATING() {
        return mCRRATING;
    }

    @JsonProperty("mcr_rating")
    public void setMCRRATING(String mCRRATING) {
        this.mCRRATING = mCRRATING;
    }

    @JsonProperty("mbpc")
    public String getMBPC() {
        return mBPC;
    }

    @JsonProperty("mbpc")
    public void setMBPC(String mBPC) {
        this.mBPC = mBPC;
    }

    @JsonProperty("shmc")
    public String getSHMC() {
        return sHMC;
    }

    @JsonProperty("shmc")
    public void setSHMC(String sHMC) {
        this.sHMC = sHMC;
    }

    @JsonProperty("ccx")
    public String getCCX() {
        return cCX;
    }

    @JsonProperty("ccx")
    public void setCCX(String cCX) {
        this.cCX = cCX;
    }

    @JsonProperty("omt1")
    public String getOMT1() {
        return oMT1;
    }

    @JsonProperty("omt1")
    public void setOMT1(String oMT1) {
        this.oMT1 = oMT1;
    }

    @JsonProperty("omt2")
    public String getOMT2() {
        return oMT2;
    }

    @JsonProperty("omt2")
    public void setOMT2(String oMT2) {
        this.oMT2 = oMT2;
    }

    @JsonProperty("oat1")
    public String getOAT1() {
        return oAT1;
    }

    @JsonProperty("oat1")
    public void setOAT1(String oAT1) {
        this.oAT1 = oAT1;
    }

    @JsonProperty("ost2")
    public String getOST2() {
        return oST2;
    }

    @JsonProperty("ost2")
    public void setOST2(String oST2) {
        this.oST2 = oST2;
    }

    @JsonProperty("ost1")
    public String getOST1() {
        return oST1;
    }

    @JsonProperty("ost1")
    public void setOST1(String oST1) {
        this.oST1 = oST1;
    }

    @JsonProperty("oat2")
    public String getOAT2() {
        return oAT2;
    }

    @JsonProperty("oat2")
    public void setOAT2(String oAT2) {
        this.oAT2 = oAT2;
    }

    @JsonProperty("omt1_eff_dt")
    public String getOMT1EFFDT() {
        return oMT1EFFDT;
    }

    @JsonProperty("omt1_eff_dt")
    public void setOMT1EFFDT(String oMT1EFFDT) {
        this.oMT1EFFDT = oMT1EFFDT;
    }

    @JsonProperty("omt1_end_dt")
    public String getOMT1ENDDT() {
        return oMT1ENDDT;
    }

    @JsonProperty("omt1_end_dt")
    public void setOMT1ENDDT(String oMT1ENDDT) {
        this.oMT1ENDDT = oMT1ENDDT;
    }

    @JsonProperty("omt2_eff_dt")
    public String getOMT2EFFDT() {
        return oMT2EFFDT;
    }

    @JsonProperty("omt2_eff_dt")
    public void setOMT2EFFDT(String oMT2EFFDT) {
        this.oMT2EFFDT = oMT2EFFDT;
    }

    @JsonProperty("omt2_end_dt")
    public String getOMT2ENDDT() {
        return oMT2ENDDT;
    }

    @JsonProperty("omt2_end_dt")
    public void setOMT2ENDDT(String oMT2ENDDT) {
        this.oMT2ENDDT = oMT2ENDDT;
    }

    @JsonProperty("oat1_eff_dt")
    public String getOAT1EFFDT() {
        return oAT1EFFDT;
    }

    @JsonProperty("oat1_eff_dt")
    public void setOAT1EFFDT(String oAT1EFFDT) {
        this.oAT1EFFDT = oAT1EFFDT;
    }

    @JsonProperty("oat1_end_dt")
    public String getOAT1ENDDT() {
        return oAT1ENDDT;
    }

    @JsonProperty("oat1_end_dt")
    public void setOAT1ENDDT(String oAT1ENDDT) {
        this.oAT1ENDDT = oAT1ENDDT;
    }

    @JsonProperty("ost2_eff_dt")
    public String getOST2EFFDT() {
        return oST2EFFDT;
    }

    @JsonProperty("ost2_eff_dt")
    public void setOST2EFFDT(String oST2EFFDT) {
        this.oST2EFFDT = oST2EFFDT;
    }

    @JsonProperty("ost2_end_dt")
    public String getOST2ENDDT() {
        return oST2ENDDT;
    }

    @JsonProperty("ost2_end_dt")
    public void setOST2ENDDT(String oST2ENDDT) {
        this.oST2ENDDT = oST2ENDDT;
    }

    @JsonProperty("ost1_eff_dt")
    public String getOST1EFFDT() {
        return oST1EFFDT;
    }

    @JsonProperty("ost1_eff_dt")
    public void setOST1EFFDT(String oST1EFFDT) {
        this.oST1EFFDT = oST1EFFDT;
    }

    @JsonProperty("ost1_end_dt")
    public String getOST1ENDDT() {
        return oST1ENDDT;
    }

    @JsonProperty("ost1_end_dt")
    public void setOST1ENDDT(String oST1ENDDT) {
        this.oST1ENDDT = oST1ENDDT;
    }

    @JsonProperty("oat2_eff_dt")
    public String getOAT2EFFDT() {
        return oAT2EFFDT;
    }

    @JsonProperty("oat2_eff_dt")
    public void setOAT2EFFDT(String oAT2EFFDT) {
        this.oAT2EFFDT = oAT2EFFDT;
    }

    @JsonProperty("oat2_end_dt")
    public String getOAT2ENDDT() {
        return oAT2ENDDT;
    }

    @JsonProperty("oat2_end_dt")
    public void setOAT2ENDDT(String oAT2ENDDT) {
        this.oAT2ENDDT = oAT2ENDDT;
    }

    @JsonProperty("trad_eff_dt")
    public String getTRADEFFDT() {
        return tRADEFFDT;
    }

    @JsonProperty("trad_eff_dt")
    public void setTRADEFFDT(String tRADEFFDT) {
        this.tRADEFFDT = tRADEFFDT;
    }

    @JsonProperty("trad_end_dt")
    public String getTRADENDDT() {
        return tRADENDDT;
    }

    @JsonProperty("trad_end_dt")
    public void setTRADENDDT(String tRADENDDT) {
        this.tRADENDDT = tRADENDDT;
    }

    @JsonProperty("mgcn_eff_dt")
    public String getMGCNEFFDT() {
        return mGCNEFFDT;
    }

    @JsonProperty("mgcn_eff_dt")
    public void setMGCNEFFDT(String mGCNEFFDT) {
        this.mGCNEFFDT = mGCNEFFDT;
    }

    @JsonProperty("mgcn_end_dt")
    public String getMGCNENDDT() {
        return mGCNENDDT;
    }

    @JsonProperty("mgcn_end_dt")
    public void setMGCNENDDT(String mGCNENDDT) {
        this.mGCNENDDT = mGCNENDDT;
    }

    @JsonProperty("mcbl_eff_dt")
    public String getMCBLEFFDT() {
        return mCBLEFFDT;
    }

    @JsonProperty("mcbl_eff_dt")
    public void setMCBLEFFDT(String mCBLEFFDT) {
        this.mCBLEFFDT = mCBLEFFDT;
    }

    @JsonProperty("mcbl_end_dt")
    public String getMCBLENDDT() {
        return mCBLENDDT;
    }

    @JsonProperty("mcbl_end_dt")
    public void setMCBLENDDT(String mCBLENDDT) {
        this.mCBLENDDT = mCBLENDDT;
    }

    @JsonProperty("advn_eff_dt")
    public String getADVNEFFDT() {
        return aDVNEFFDT;
    }

    @JsonProperty("advn_eff_dt")
    public void setADVNEFFDT(String aDVNEFFDT) {
        this.aDVNEFFDT = aDVNEFFDT;
    }

    @JsonProperty("advn_end_dt")
    public String getADVNENDDT() {
        return aDVNENDDT;
    }

    @JsonProperty("advn_end_dt")
    public void setADVNENDDT(String aDVNENDDT) {
        this.aDVNENDDT = aDVNENDDT;
    }

    @JsonProperty("aco_eff_dt")
    public String getACOEFFDT() {
        return aCOEFFDT;
    }

    @JsonProperty("aco_eff_dt")
    public void setACOEFFDT(String aCOEFFDT) {
        this.aCOEFFDT = aCOEFFDT;
    }

    @JsonProperty("aco_end_dt")
    public String getACOENDDT() {
        return aCOENDDT;
    }

    @JsonProperty("aco_end_dt")
    public void setACOENDDT(String aCOENDDT) {
        this.aCOENDDT = aCOENDDT;
    }

    @JsonProperty("pcmh_eff_dt")
    public String getPCMHEFFDT() {
        return pCMHEFFDT;
    }

    @JsonProperty("pcmh_eff_dt")
    public void setPCMHEFFDT(String pCMHEFFDT) {
        this.pCMHEFFDT = pCMHEFFDT;
    }

    @JsonProperty("pcmh_end_dt")
    public String getPCMHENDDT() {
        return pCMHENDDT;
    }

    @JsonProperty("pcmh_end_dt")
    public void setPCMHENDDT(String pCMHENDDT) {
        this.pCMHENDDT = pCMHENDDT;
    }

    @JsonProperty("mbpc_eff_dt")
    public String getMBPCEFFDT() {
        return mBPCEFFDT;
    }

    @JsonProperty("mbpc_eff_dt")
    public void setMBPCEFFDT(String mBPCEFFDT) {
        this.mBPCEFFDT = mBPCEFFDT;
    }

    @JsonProperty("mbpc_end_dt")
    public String getMBPCENDDT() {
        return mBPCENDDT;
    }

    @JsonProperty("mbpc_end_dt")
    public void setMBPCENDDT(String mBPCENDDT) {
        this.mBPCENDDT = mBPCENDDT;
    }

    @JsonProperty("shmc_eff_dt")
    public String getSHMCEFFDT() {
        return sHMCEFFDT;
    }

    @JsonProperty("shmc_eff_dt")
    public void setSHMCEFFDT(String sHMCEFFDT) {
        this.sHMCEFFDT = sHMCEFFDT;
    }

    @JsonProperty("shmc_end_dt")
    public String getSHMCENDDT() {
        return sHMCENDDT;
    }

    @JsonProperty("shmc_end_dt")
    public void setSHMCENDDT(String sHMCENDDT) {
        this.sHMCENDDT = sHMCENDDT;
    }

    @JsonProperty("rwjb")
    public String getRWJB() {
        return rWJB;
    }

    @JsonProperty("rwjb")
    public void setRWJB(String rWJB) {
        this.rWJB = rWJB;
    }

    @JsonProperty("rwjb_eff_dt")
    public String getRWJBEFFDT() {
        return rWJBEFFDT;
    }

    @JsonProperty("rwjb_eff_dt")
    public void setRWJBEFFDT(String rWJBEFFDT) {
        this.rWJBEFFDT = rWJBEFFDT;
    }

    @JsonProperty("rwjb_end_dt")
    public String getRWJBENDDT() {
        return rWJBENDDT;
    }

    @JsonProperty("rwjb_end_dt")
    public void setRWJBENDDT(String rWJBENDDT) {
        this.rWJBENDDT = rWJBENDDT;
    }

    @JsonProperty("mbav")
    public String getMBAV() {
        return mBAV;
    }

    @JsonProperty("mbav")
    public void setMBAV(String mBAV) {
        this.mBAV = mBAV;
    }

    @JsonProperty("mbav_eff_dt")
    public String getMBAVEFFDT() {
        return mBAVEFFDT;
    }

    @JsonProperty("mbav_eff_dt")
    public void setMBAVEFFDT(String mBAVEFFDT) {
        this.mBAVEFFDT = mBAVEFFDT;
    }

    @JsonProperty("mbav_end_dt")
    public String getMBAVENDDT() {
        return mBAVENDDT;
    }

    @JsonProperty("mbav_end_dt")
    public void setMBAVENDDT(String mBAVENDDT) {
        this.mBAVENDDT = mBAVENDDT;
    }

    @JsonProperty("hmic")
    public String getHMIC() {
        return hMIC;
    }

    @JsonProperty("hmic")
    public void setHMIC(String hMIC) {
        this.hMIC = hMIC;
    }

    @JsonProperty("hmic_eff_dt")
    public String getHMICEFFDT() {
        return hMICEFFDT;
    }

    @JsonProperty("hmic_eff_dt")
    public void setHMICEFFDT(String hMICEFFDT) {
        this.hMICEFFDT = hMICEFFDT;
    }

    @JsonProperty("hmic_end_dt")
    public String getHMICENDDT() {
        return hMICENDDT;
    }

    @JsonProperty("hmic_end_dt")
    public void setHMICENDDT(String hMICENDDT) {
        this.hMICENDDT = hMICENDDT;
    }

    @JsonProperty("insp")
    public String getINSP() {
        return iNSP;
    }

    @JsonProperty("insp")
    public void setINSP(String iNSP) {
        this.iNSP = iNSP;
    }

    @JsonProperty("insp_eff_dt")
    public String getINSPEFFDT() {
        return iNSPEFFDT;
    }

    @JsonProperty("insp_eff_dt")
    public void setINSPEFFDT(String iNSPEFFDT) {
        this.iNSPEFFDT = iNSPEFFDT;
    }

    @JsonProperty("insp_end_dt")
    public String getINSPENDDT() {
        return iNSPENDDT;
    }

    @JsonProperty("insp_end_dt")
    public void setINSPENDDT(String iNSPENDDT) {
        this.iNSPENDDT = iNSPENDDT;
    }

    @JsonProperty("trnt")
    public String getTRNT() {
        return tRNT;
    }

    @JsonProperty("trnt")
    public void setTRNT(String tRNT) {
        this.tRNT = tRNT;
    }

    @JsonProperty("trnt_eff_dt")
    public String getTRNTEFFDT() {
        return tRNTEFFDT;
    }

    @JsonProperty("trnt_eff_dt")
    public void setTRNTEFFDT(String tRNTEFFDT) {
        this.tRNTEFFDT = tRNTEFFDT;
    }

    @JsonProperty("trnt_end_dt")
    public String getTRNTENDDT() {
        return tRNTENDDT;
    }

    @JsonProperty("trnt_end_dt")
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
