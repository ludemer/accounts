/*
               File: accounts.SdtSalesRepresentative
        Description: SalesRepresentative
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.60
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

public final  class SdtSalesRepresentative extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSalesRepresentative( )
   {
      this(  new ModelContext(SdtSalesRepresentative.class));
   }

   public SdtSalesRepresentative( ModelContext context )
   {
      super( context, "SdtSalesRepresentative");
   }

   public SdtSalesRepresentative( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSalesRepresentative");
   }

   public SdtSalesRepresentative( StructSdtSalesRepresentative struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "email") )
            {
               gxTv_SdtSalesRepresentative_Email = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "name") )
            {
               gxTv_SdtSalesRepresentative_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "phone") )
            {
               gxTv_SdtSalesRepresentative_Phone = oReader.getValue() ;
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
         sName = "SalesRepresentative" ;
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
      oWriter.writeElement("email", GXutil.rtrim( gxTv_SdtSalesRepresentative_Email));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("name", GXutil.rtrim( gxTv_SdtSalesRepresentative_Name));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("phone", GXutil.rtrim( gxTv_SdtSalesRepresentative_Phone));
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
      AddObjectProperty("email", gxTv_SdtSalesRepresentative_Email, false, false);
      AddObjectProperty("name", gxTv_SdtSalesRepresentative_Name, false, false);
      AddObjectProperty("phone", gxTv_SdtSalesRepresentative_Phone, false, false);
   }

   public String getgxTv_SdtSalesRepresentative_Email( )
   {
      return gxTv_SdtSalesRepresentative_Email ;
   }

   public void setgxTv_SdtSalesRepresentative_Email( String value )
   {
      gxTv_SdtSalesRepresentative_Email = value ;
   }

   public String getgxTv_SdtSalesRepresentative_Name( )
   {
      return gxTv_SdtSalesRepresentative_Name ;
   }

   public void setgxTv_SdtSalesRepresentative_Name( String value )
   {
      gxTv_SdtSalesRepresentative_Name = value ;
   }

   public String getgxTv_SdtSalesRepresentative_Phone( )
   {
      return gxTv_SdtSalesRepresentative_Phone ;
   }

   public void setgxTv_SdtSalesRepresentative_Phone( String value )
   {
      gxTv_SdtSalesRepresentative_Phone = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSalesRepresentative_Email = "" ;
      gxTv_SdtSalesRepresentative_Name = "" ;
      gxTv_SdtSalesRepresentative_Phone = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtSalesRepresentative Clone( )
   {
      return (com.b2brestv1.accounts.SdtSalesRepresentative)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtSalesRepresentative struct )
   {
      setgxTv_SdtSalesRepresentative_Email(struct.getEmail());
      setgxTv_SdtSalesRepresentative_Name(struct.getName());
      setgxTv_SdtSalesRepresentative_Phone(struct.getPhone());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtSalesRepresentative getStruct( )
   {
      com.b2brestv1.accounts.StructSdtSalesRepresentative struct = new com.b2brestv1.accounts.StructSdtSalesRepresentative ();
      struct.setEmail(getgxTv_SdtSalesRepresentative_Email());
      struct.setName(getgxTv_SdtSalesRepresentative_Name());
      struct.setPhone(getgxTv_SdtSalesRepresentative_Phone());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtSalesRepresentative_Email ;
   protected String gxTv_SdtSalesRepresentative_Name ;
   protected String gxTv_SdtSalesRepresentative_Phone ;
}

