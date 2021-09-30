/*
               File: accounts.StructSdtDeliveryAddress
        Description: DeliveryAddress
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:24.34
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtDeliveryAddress implements Cloneable, java.io.Serializable
{
   public StructSdtDeliveryAddress( )
   {
      gxTv_SdtDeliveryAddress_Address = "" ;
      gxTv_SdtDeliveryAddress_City = "" ;
      gxTv_SdtDeliveryAddress_Latitude = "" ;
      gxTv_SdtDeliveryAddress_Longitude = "" ;
      gxTv_SdtDeliveryAddress_State = "" ;
      gxTv_SdtDeliveryAddress_Zipcode = "" ;
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

   public String getAddress( )
   {
      return gxTv_SdtDeliveryAddress_Address ;
   }

   public void setAddress( String value )
   {
      gxTv_SdtDeliveryAddress_Address = value ;
   }

   public String getCity( )
   {
      return gxTv_SdtDeliveryAddress_City ;
   }

   public void setCity( String value )
   {
      gxTv_SdtDeliveryAddress_City = value ;
   }

   public String getLatitude( )
   {
      return gxTv_SdtDeliveryAddress_Latitude ;
   }

   public void setLatitude( String value )
   {
      gxTv_SdtDeliveryAddress_Latitude = value ;
   }

   public String getLongitude( )
   {
      return gxTv_SdtDeliveryAddress_Longitude ;
   }

   public void setLongitude( String value )
   {
      gxTv_SdtDeliveryAddress_Longitude = value ;
   }

   public String getState( )
   {
      return gxTv_SdtDeliveryAddress_State ;
   }

   public void setState( String value )
   {
      gxTv_SdtDeliveryAddress_State = value ;
   }

   public String getZipcode( )
   {
      return gxTv_SdtDeliveryAddress_Zipcode ;
   }

   public void setZipcode( String value )
   {
      gxTv_SdtDeliveryAddress_Zipcode = value ;
   }

   protected String gxTv_SdtDeliveryAddress_Address ;
   protected String gxTv_SdtDeliveryAddress_City ;
   protected String gxTv_SdtDeliveryAddress_Latitude ;
   protected String gxTv_SdtDeliveryAddress_Longitude ;
   protected String gxTv_SdtDeliveryAddress_State ;
   protected String gxTv_SdtDeliveryAddress_Zipcode ;
}

