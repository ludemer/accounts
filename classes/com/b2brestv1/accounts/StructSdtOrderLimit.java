/*
               File: accounts.StructSdtOrderLimit
        Description: OrderLimit
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.89
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtOrderLimit implements Cloneable, java.io.Serializable
{
   public StructSdtOrderLimit( )
   {
      gxTv_SdtOrderLimit_Type = "" ;
      gxTv_SdtOrderLimit_Value = "" ;
      gxTv_SdtOrderLimit_Paymentmethods_N = (byte)(1) ;
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

   public java.util.Vector getPaymentmethods( )
   {
      return gxTv_SdtOrderLimit_Paymentmethods ;
   }

   public void setPaymentmethods( java.util.Vector value )
   {
      gxTv_SdtOrderLimit_Paymentmethods_N = (byte)(0) ;
      gxTv_SdtOrderLimit_Paymentmethods = value ;
   }

   public String getType( )
   {
      return gxTv_SdtOrderLimit_Type ;
   }

   public void setType( String value )
   {
      gxTv_SdtOrderLimit_Type = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtOrderLimit_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtOrderLimit_Value = value ;
   }

   protected byte gxTv_SdtOrderLimit_Paymentmethods_N ;
   protected String gxTv_SdtOrderLimit_Value ;
   protected String gxTv_SdtOrderLimit_Type ;
   protected java.util.Vector gxTv_SdtOrderLimit_Paymentmethods=null ;
}

