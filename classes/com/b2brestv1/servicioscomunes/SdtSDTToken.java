/*
               File: servicioscomunes.SdtSDTToken
        Description: SDTToken
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:23.68
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

public final  class SdtSDTToken extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTToken( )
   {
      this(  new ModelContext(SdtSDTToken.class));
   }

   public SdtSDTToken( ModelContext context )
   {
      super( context, "SdtSDTToken");
   }

   public SdtSDTToken( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTToken");
   }

   public SdtSDTToken( StructSdtSDTToken struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "token_type") )
            {
               gxTv_SdtSDTToken_Token_type = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "expires_in") )
            {
               gxTv_SdtSDTToken_Expires_in = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ext_expires_in") )
            {
               gxTv_SdtSDTToken_Ext_expires_in = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "access_token") )
            {
               gxTv_SdtSDTToken_Access_token = oReader.getValue() ;
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
         sName = "SDTToken" ;
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
      oWriter.writeElement("token_type", GXutil.rtrim( gxTv_SdtSDTToken_Token_type));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("expires_in", GXutil.rtrim( gxTv_SdtSDTToken_Expires_in));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("ext_expires_in", GXutil.rtrim( gxTv_SdtSDTToken_Ext_expires_in));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("access_token", GXutil.rtrim( gxTv_SdtSDTToken_Access_token));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("token_type", gxTv_SdtSDTToken_Token_type, false, false);
      AddObjectProperty("expires_in", gxTv_SdtSDTToken_Expires_in, false, false);
      AddObjectProperty("ext_expires_in", gxTv_SdtSDTToken_Ext_expires_in, false, false);
      AddObjectProperty("access_token", gxTv_SdtSDTToken_Access_token, false, false);
   }

   public String getgxTv_SdtSDTToken_Token_type( )
   {
      return gxTv_SdtSDTToken_Token_type ;
   }

   public void setgxTv_SdtSDTToken_Token_type( String value )
   {
      gxTv_SdtSDTToken_Token_type = value ;
   }

   public String getgxTv_SdtSDTToken_Expires_in( )
   {
      return gxTv_SdtSDTToken_Expires_in ;
   }

   public void setgxTv_SdtSDTToken_Expires_in( String value )
   {
      gxTv_SdtSDTToken_Expires_in = value ;
   }

   public String getgxTv_SdtSDTToken_Ext_expires_in( )
   {
      return gxTv_SdtSDTToken_Ext_expires_in ;
   }

   public void setgxTv_SdtSDTToken_Ext_expires_in( String value )
   {
      gxTv_SdtSDTToken_Ext_expires_in = value ;
   }

   public String getgxTv_SdtSDTToken_Access_token( )
   {
      return gxTv_SdtSDTToken_Access_token ;
   }

   public void setgxTv_SdtSDTToken_Access_token( String value )
   {
      gxTv_SdtSDTToken_Access_token = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTToken_Token_type = "" ;
      gxTv_SdtSDTToken_Expires_in = "" ;
      gxTv_SdtSDTToken_Ext_expires_in = "" ;
      gxTv_SdtSDTToken_Access_token = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.servicioscomunes.SdtSDTToken Clone( )
   {
      return (com.b2brestv1.servicioscomunes.SdtSDTToken)(clone()) ;
   }

   public void setStruct( com.b2brestv1.servicioscomunes.StructSdtSDTToken struct )
   {
      setgxTv_SdtSDTToken_Token_type(struct.getToken_type());
      setgxTv_SdtSDTToken_Expires_in(struct.getExpires_in());
      setgxTv_SdtSDTToken_Ext_expires_in(struct.getExt_expires_in());
      setgxTv_SdtSDTToken_Access_token(struct.getAccess_token());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.servicioscomunes.StructSdtSDTToken getStruct( )
   {
      com.b2brestv1.servicioscomunes.StructSdtSDTToken struct = new com.b2brestv1.servicioscomunes.StructSdtSDTToken ();
      struct.setToken_type(getgxTv_SdtSDTToken_Token_type());
      struct.setExpires_in(getgxTv_SdtSDTToken_Expires_in());
      struct.setExt_expires_in(getgxTv_SdtSDTToken_Ext_expires_in());
      struct.setAccess_token(getgxTv_SdtSDTToken_Access_token());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTToken_Access_token ;
   protected String gxTv_SdtSDTToken_Token_type ;
   protected String gxTv_SdtSDTToken_Expires_in ;
   protected String gxTv_SdtSDTToken_Ext_expires_in ;
}

