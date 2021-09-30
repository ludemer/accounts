/*
               File: accounts.StructSdtAccountRequest_AccountRequestItem
        Description: AccountRequest
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.35
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtAccountRequest_AccountRequestItem implements Cloneable, java.io.Serializable
{
   public StructSdtAccountRequest_AccountRequestItem( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Accountid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Channel = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Name = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Potential = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Salesroute = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Segment = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Status = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Subsegment = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Taxid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Owner_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getAccountid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Accountid ;
   }

   public void setAccountid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Accountid = value ;
   }

   public String getChannel( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Channel ;
   }

   public void setChannel( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Channel = value ;
   }

   public com.b2brestv1.accounts.StructSdtDeliveryAddress getDeliveryaddress( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress ;
   }

   public void setDeliveryaddress( com.b2brestv1.accounts.StructSdtDeliveryAddress value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress = value;
   }

   public String getDeliverycenterid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid ;
   }

   public void setDeliverycenterid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid = value ;
   }

   public String getDeliveryregion( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion ;
   }

   public void setDeliveryregion( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion = value ;
   }

   public String getDeliveryroute( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute ;
   }

   public void setDeliveryroute( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute = value ;
   }

   public String getDeliveryscheduleid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid ;
   }

   public void setDeliveryscheduleid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid = value ;
   }

   public String getErpsalescenter( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter ;
   }

   public void setErpsalescenter( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter = value ;
   }

   public java.util.Vector<com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem> getLiquorlicense( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense ;
   }

   public void setLiquorlicense( java.util.Vector<com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem> value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense = value ;
   }

   public com.b2brestv1.accounts.StructSdtOrderLimit getMinimumorder( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder ;
   }

   public void setMinimumorder( com.b2brestv1.accounts.StructSdtOrderLimit value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder = value;
   }

   public String getName( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Name = value ;
   }

   public com.b2brestv1.accounts.StructSdtOwner getOwner( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Owner ;
   }

   public void setOwner( com.b2brestv1.accounts.StructSdtOwner value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Owner_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Owner = value;
   }

   public java.util.Vector getPaymentmethods( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods ;
   }

   public void setPaymentmethods( java.util.Vector value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods = value ;
   }

   public java.util.Vector<com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem> getPaymentterms( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms ;
   }

   public void setPaymentterms( java.util.Vector<com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem> value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms = value ;
   }

   public String getPotential( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Potential ;
   }

   public void setPotential( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Potential = value ;
   }

   public String getPricelistid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid ;
   }

   public void setPricelistid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid = value ;
   }

   public com.b2brestv1.accounts.StructSdtSalesRepresentative getSalesrepresentative( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative ;
   }

   public void setSalesrepresentative( com.b2brestv1.accounts.StructSdtSalesRepresentative value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative = value;
   }

   public String getSalesroute( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Salesroute ;
   }

   public void setSalesroute( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Salesroute = value ;
   }

   public String getSegment( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Segment ;
   }

   public void setSegment( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Segment = value ;
   }

   public String getStatus( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Status ;
   }

   public void setStatus( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Status = value ;
   }

   public String getSubsegment( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Subsegment ;
   }

   public void setSubsegment( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Subsegment = value ;
   }

   public String getTaxid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Taxid ;
   }

   public void setTaxid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Taxid = value ;
   }

   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Owner_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Accountid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Channel ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Name ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Potential ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Salesroute ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Segment ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Status ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Subsegment ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Taxid ;
   protected com.b2brestv1.accounts.StructSdtDeliveryAddress gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress=null ;
   protected com.b2brestv1.accounts.StructSdtOrderLimit gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder=null ;
   protected com.b2brestv1.accounts.StructSdtOwner gxTv_SdtAccountRequest_AccountRequestItem_Owner=null ;
   protected com.b2brestv1.accounts.StructSdtSalesRepresentative gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative=null ;
   protected java.util.Vector<com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem> gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense=null ;
   protected java.util.Vector gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods=null ;
   protected java.util.Vector<com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem> gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms=null ;
}

