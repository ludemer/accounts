/*
               File: accounts.StructSdtPaymentTerm_PaymentTermItem
        Description: PaymentTerm
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:26.0
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtPaymentTerm_PaymentTermItem implements Cloneable, java.io.Serializable
{
   public StructSdtPaymentTerm_PaymentTermItem( )
   {
      gxTv_SdtPaymentTerm_PaymentTermItem_Type = "" ;
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N = (byte)(1) ;
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

   public java.util.Vector<com.b2brestv1.accounts.StructSdtTermPeriod> getTermperiods( )
   {
      return gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods ;
   }

   public void setTermperiods( java.util.Vector<com.b2brestv1.accounts.StructSdtTermPeriod> value )
   {
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N = (byte)(0) ;
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods = value ;
   }

   public String getType( )
   {
      return gxTv_SdtPaymentTerm_PaymentTermItem_Type ;
   }

   public void setType( String value )
   {
      gxTv_SdtPaymentTerm_PaymentTermItem_Type = value ;
   }

   protected byte gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N ;
   protected String gxTv_SdtPaymentTerm_PaymentTermItem_Type ;
   protected java.util.Vector<com.b2brestv1.accounts.StructSdtTermPeriod> gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods=null ;
}

