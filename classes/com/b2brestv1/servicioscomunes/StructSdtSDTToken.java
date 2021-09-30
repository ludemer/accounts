/*
               File: servicioscomunes.StructSdtSDTToken
        Description: SDTToken
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:23.73
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.genexus.*;

public final  class StructSdtSDTToken implements Cloneable, java.io.Serializable
{
   public StructSdtSDTToken( )
   {
      gxTv_SdtSDTToken_Token_type = "" ;
      gxTv_SdtSDTToken_Expires_in = "" ;
      gxTv_SdtSDTToken_Ext_expires_in = "" ;
      gxTv_SdtSDTToken_Access_token = "" ;
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

   public String getToken_type( )
   {
      return gxTv_SdtSDTToken_Token_type ;
   }

   public void setToken_type( String value )
   {
      gxTv_SdtSDTToken_Token_type = value ;
   }

   public String getExpires_in( )
   {
      return gxTv_SdtSDTToken_Expires_in ;
   }

   public void setExpires_in( String value )
   {
      gxTv_SdtSDTToken_Expires_in = value ;
   }

   public String getExt_expires_in( )
   {
      return gxTv_SdtSDTToken_Ext_expires_in ;
   }

   public void setExt_expires_in( String value )
   {
      gxTv_SdtSDTToken_Ext_expires_in = value ;
   }

   public String getAccess_token( )
   {
      return gxTv_SdtSDTToken_Access_token ;
   }

   public void setAccess_token( String value )
   {
      gxTv_SdtSDTToken_Access_token = value ;
   }

   protected String gxTv_SdtSDTToken_Access_token ;
   protected String gxTv_SdtSDTToken_Token_type ;
   protected String gxTv_SdtSDTToken_Expires_in ;
   protected String gxTv_SdtSDTToken_Ext_expires_in ;
}

