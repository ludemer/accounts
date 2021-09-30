/*
               File: servicioscomunes.Sdtwkghttpclient
        Description: wkghttpclient
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:23.8
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtwkghttpclient extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public Sdtwkghttpclient( )
   {
      this(  new ModelContext(Sdtwkghttpclient.class));
   }

   public Sdtwkghttpclient( ModelContext context )
   {
      super( context, "Sdtwkghttpclient");
   }

   public Sdtwkghttpclient( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "Sdtwkghttpclient");
   }

   public Sdtwkghttpclient( StructSdtwkghttpclient struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public String wkghttpdelete( String gxTp_url ,
                                String gxTp_varHeaders ,
                                String gxTp_BodyContent )
   {
      String returnwkghttpdelete;
      if ( ServiciosComunes_wkghttpclient_externalReference == null )
      {
         ServiciosComunes_wkghttpclient_externalReference = new com.workgroup.wkghttpclient() ;
      }
      returnwkghttpdelete = "";
      returnwkghttpdelete = ServiciosComunes_wkghttpclient_externalReference.wkghttpdelete(gxTp_url, gxTp_varHeaders, gxTp_BodyContent) ;
      return returnwkghttpdelete ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
   }

   public com.workgroup.wkghttpclient getExternalInstance( )
   {
      if ( ServiciosComunes_wkghttpclient_externalReference == null )
      {
         ServiciosComunes_wkghttpclient_externalReference = new com.workgroup.wkghttpclient() ;
      }
      return ServiciosComunes_wkghttpclient_externalReference ;
   }

   public void setExternalInstance( com.workgroup.wkghttpclient value )
   {
      ServiciosComunes_wkghttpclient_externalReference = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
   }

   public com.b2brestv1.servicioscomunes.Sdtwkghttpclient Clone( )
   {
      return (com.b2brestv1.servicioscomunes.Sdtwkghttpclient)(clone()) ;
   }

   public void setStruct( com.b2brestv1.servicioscomunes.StructSdtwkghttpclient struct )
   {
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.servicioscomunes.StructSdtwkghttpclient getStruct( )
   {
      com.b2brestv1.servicioscomunes.StructSdtwkghttpclient struct = new com.b2brestv1.servicioscomunes.StructSdtwkghttpclient ();
      return struct ;
   }

   protected com.workgroup.wkghttpclient ServiciosComunes_wkghttpclient_externalReference=null ;
}

