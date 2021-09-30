/*
               File: openapicommon.StructSdtApiResponse
        Description: ApiResponse
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:26.29
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.openapicommon ;
import com.genexus.*;

public final  class StructSdtApiResponse implements Cloneable, java.io.Serializable
{
   public StructSdtApiResponse( )
   {
      gxTv_SdtApiResponse_Content = "" ;
      gxTv_SdtApiResponse_Errormessage = "" ;
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

   public int getStatuscode( )
   {
      return gxTv_SdtApiResponse_Statuscode ;
   }

   public void setStatuscode( int value )
   {
      gxTv_SdtApiResponse_Statuscode = value ;
   }

   public String getContent( )
   {
      return gxTv_SdtApiResponse_Content ;
   }

   public void setContent( String value )
   {
      gxTv_SdtApiResponse_Content = value ;
   }

   public short getErrorcode( )
   {
      return gxTv_SdtApiResponse_Errorcode ;
   }

   public void setErrorcode( short value )
   {
      gxTv_SdtApiResponse_Errorcode = value ;
   }

   public String getErrormessage( )
   {
      return gxTv_SdtApiResponse_Errormessage ;
   }

   public void setErrormessage( String value )
   {
      gxTv_SdtApiResponse_Errormessage = value ;
   }

   protected short gxTv_SdtApiResponse_Errorcode ;
   protected int gxTv_SdtApiResponse_Statuscode ;
   protected String gxTv_SdtApiResponse_Errormessage ;
   protected String gxTv_SdtApiResponse_Content ;
}

