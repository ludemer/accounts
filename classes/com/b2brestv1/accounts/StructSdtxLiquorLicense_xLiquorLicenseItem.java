/*
               File: accounts.StructSdtxLiquorLicense_xLiquorLicenseItem
        Description: xLiquorLicense
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.81
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtxLiquorLicense_xLiquorLicenseItem implements Cloneable, java.io.Serializable
{
   public StructSdtxLiquorLicense_xLiquorLicenseItem( )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type = "" ;
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

   public String getDescription( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description = value ;
   }

   public String getExpirationdate( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate ;
   }

   public void setExpirationdate( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate = value ;
   }

   public String getNumber( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number ;
   }

   public void setNumber( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number = value ;
   }

   public String getStatus( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status ;
   }

   public void setStatus( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status = value ;
   }

   public String getType( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type ;
   }

   public void setType( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type = value ;
   }

   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type ;
}

