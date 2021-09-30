/*
               File: openapicommon.SdtApiResponse
        Description: ApiResponse
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:26.25
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.openapicommon ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtApiResponse extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtApiResponse( )
   {
      this(  new ModelContext(SdtApiResponse.class));
   }

   public SdtApiResponse( ModelContext context )
   {
      super( context, "SdtApiResponse");
   }

   public SdtApiResponse( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtApiResponse");
   }

   public SdtApiResponse( StructSdtApiResponse struct )
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

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "StatusCode") )
            {
               gxTv_SdtApiResponse_Statuscode = (int)(getnumericvalue(oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Content") )
            {
               gxTv_SdtApiResponse_Content = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ErrorCode") )
            {
               gxTv_SdtApiResponse_Errorcode = (short)(getnumericvalue(oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ErrorMessage") )
            {
               gxTv_SdtApiResponse_Errormessage = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
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
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "ApiResponse" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "B2BRestV1" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("StatusCode", GXutil.trim( GXutil.str( gxTv_SdtApiResponse_Statuscode, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("Content", GXutil.rtrim( gxTv_SdtApiResponse_Content));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("ErrorCode", GXutil.trim( GXutil.str( gxTv_SdtApiResponse_Errorcode, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("ErrorMessage", GXutil.rtrim( gxTv_SdtApiResponse_Errormessage));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
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
      AddObjectProperty("StatusCode", gxTv_SdtApiResponse_Statuscode, false, false);
      AddObjectProperty("Content", gxTv_SdtApiResponse_Content, false, false);
      AddObjectProperty("ErrorCode", gxTv_SdtApiResponse_Errorcode, false, false);
      AddObjectProperty("ErrorMessage", gxTv_SdtApiResponse_Errormessage, false, false);
   }

   public int getgxTv_SdtApiResponse_Statuscode( )
   {
      return gxTv_SdtApiResponse_Statuscode ;
   }

   public void setgxTv_SdtApiResponse_Statuscode( int value )
   {
      gxTv_SdtApiResponse_Statuscode = value ;
   }

   public String getgxTv_SdtApiResponse_Content( )
   {
      return gxTv_SdtApiResponse_Content ;
   }

   public void setgxTv_SdtApiResponse_Content( String value )
   {
      gxTv_SdtApiResponse_Content = value ;
   }

   public short getgxTv_SdtApiResponse_Errorcode( )
   {
      return gxTv_SdtApiResponse_Errorcode ;
   }

   public void setgxTv_SdtApiResponse_Errorcode( short value )
   {
      gxTv_SdtApiResponse_Errorcode = value ;
   }

   public String getgxTv_SdtApiResponse_Errormessage( )
   {
      return gxTv_SdtApiResponse_Errormessage ;
   }

   public void setgxTv_SdtApiResponse_Errormessage( String value )
   {
      gxTv_SdtApiResponse_Errormessage = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtApiResponse_Content = "" ;
      gxTv_SdtApiResponse_Errormessage = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.openapicommon.SdtApiResponse Clone( )
   {
      return (com.b2brestv1.openapicommon.SdtApiResponse)(clone()) ;
   }

   public void setStruct( com.b2brestv1.openapicommon.StructSdtApiResponse struct )
   {
      setgxTv_SdtApiResponse_Statuscode(struct.getStatuscode());
      setgxTv_SdtApiResponse_Content(struct.getContent());
      setgxTv_SdtApiResponse_Errorcode(struct.getErrorcode());
      setgxTv_SdtApiResponse_Errormessage(struct.getErrormessage());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.openapicommon.StructSdtApiResponse getStruct( )
   {
      com.b2brestv1.openapicommon.StructSdtApiResponse struct = new com.b2brestv1.openapicommon.StructSdtApiResponse ();
      struct.setStatuscode(getgxTv_SdtApiResponse_Statuscode());
      struct.setContent(getgxTv_SdtApiResponse_Content());
      struct.setErrorcode(getgxTv_SdtApiResponse_Errorcode());
      struct.setErrormessage(getgxTv_SdtApiResponse_Errormessage());
      return struct ;
   }

   protected short gxTv_SdtApiResponse_Errorcode ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtApiResponse_Statuscode ;
   protected String gxTv_SdtApiResponse_Errormessage ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtApiResponse_Content ;
}

