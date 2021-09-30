/*
               File: accounts.SdtxLiquorLicense_xLiquorLicenseItem
        Description: xLiquorLicense
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.73
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtxLiquorLicense_xLiquorLicenseItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtxLiquorLicense_xLiquorLicenseItem( )
   {
      this(  new ModelContext(SdtxLiquorLicense_xLiquorLicenseItem.class));
   }

   public SdtxLiquorLicense_xLiquorLicenseItem( ModelContext context )
   {
      super( context, "SdtxLiquorLicense_xLiquorLicenseItem");
   }

   public SdtxLiquorLicense_xLiquorLicenseItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtxLiquorLicense_xLiquorLicenseItem");
   }

   public SdtxLiquorLicense_xLiquorLicenseItem( StructSdtxLiquorLicense_xLiquorLicenseItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "description") )
            {
               gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "expirationDate") )
            {
               gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "number") )
            {
               gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "status") )
            {
               gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "type") )
            {
               gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type = oReader.getValue() ;
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
         sName = "Accounts\\xLiquorLicense.xLiquorLicenseItem" ;
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
      oWriter.writeElement("description", GXutil.rtrim( gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("expirationDate", GXutil.rtrim( gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("number", GXutil.rtrim( gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("status", GXutil.rtrim( gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("type", GXutil.rtrim( gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type));
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
      AddObjectProperty("description", gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description, false, false);
      AddObjectProperty("expirationDate", gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate, false, false);
      AddObjectProperty("number", gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number, false, false);
      AddObjectProperty("status", gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status, false, false);
      AddObjectProperty("type", gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type, false, false);
   }

   public String getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description ;
   }

   public void setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description = value ;
   }

   public String getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate ;
   }

   public void setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate = value ;
   }

   public String getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number ;
   }

   public void setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number = value ;
   }

   public String getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status ;
   }

   public void setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status = value ;
   }

   public String getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type( )
   {
      return gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type ;
   }

   public void setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type( String value )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status = "" ;
      gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem Clone( )
   {
      return (com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem struct )
   {
      setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description(struct.getDescription());
      setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate(struct.getExpirationdate());
      setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number(struct.getNumber());
      setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status(struct.getStatus());
      setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type(struct.getType());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem getStruct( )
   {
      com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem struct = new com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem ();
      struct.setDescription(getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description());
      struct.setExpirationdate(getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate());
      struct.setNumber(getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number());
      struct.setStatus(getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status());
      struct.setType(getgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status ;
   protected String gxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type ;
}

