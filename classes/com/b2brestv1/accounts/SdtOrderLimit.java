/*
               File: accounts.SdtOrderLimit
        Description: OrderLimit
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.85
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

public final  class SdtOrderLimit extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtOrderLimit( )
   {
      this(  new ModelContext(SdtOrderLimit.class));
   }

   public SdtOrderLimit( ModelContext context )
   {
      super( context, "SdtOrderLimit");
   }

   public SdtOrderLimit( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtOrderLimit");
   }

   public SdtOrderLimit( StructSdtOrderLimit struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "paymentMethods") )
            {
               if ( gxTv_SdtOrderLimit_Paymentmethods == null )
               {
                  gxTv_SdtOrderLimit_Paymentmethods = new GXSimpleCollection<String>(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtOrderLimit_Paymentmethods.readxmlcollection(oReader, "paymentMethods", "Item") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "paymentMethods") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "type") )
            {
               gxTv_SdtOrderLimit_Type = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "value") )
            {
               gxTv_SdtOrderLimit_Value = oReader.getValue() ;
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
         sName = "OrderLimit" ;
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
      if ( gxTv_SdtOrderLimit_Paymentmethods != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "B2BRestV1") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "B2BRestV1" ;
         }
         else
         {
            sNameSpace1 = "B2BRestV1" ;
         }
         gxTv_SdtOrderLimit_Paymentmethods.writexmlcollection(oWriter, "paymentMethods", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeElement("type", GXutil.rtrim( gxTv_SdtOrderLimit_Type));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("value", GXutil.rtrim( gxTv_SdtOrderLimit_Value));
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
      if ( gxTv_SdtOrderLimit_Paymentmethods != null )
      {
         AddObjectProperty("paymentMethods", gxTv_SdtOrderLimit_Paymentmethods, false, false);
      }
      AddObjectProperty("type", gxTv_SdtOrderLimit_Type, false, false);
      AddObjectProperty("value", gxTv_SdtOrderLimit_Value, false, false);
   }

   public GXSimpleCollection<String> getgxTv_SdtOrderLimit_Paymentmethods( )
   {
      if ( gxTv_SdtOrderLimit_Paymentmethods == null )
      {
         gxTv_SdtOrderLimit_Paymentmethods = new GXSimpleCollection<String>(String.class, "internal", "");
      }
      gxTv_SdtOrderLimit_Paymentmethods_N = (byte)(0) ;
      return gxTv_SdtOrderLimit_Paymentmethods ;
   }

   public void setgxTv_SdtOrderLimit_Paymentmethods( GXSimpleCollection<String> value )
   {
      gxTv_SdtOrderLimit_Paymentmethods_N = (byte)(0) ;
      gxTv_SdtOrderLimit_Paymentmethods = value ;
   }

   public void setgxTv_SdtOrderLimit_Paymentmethods_SetNull( )
   {
      gxTv_SdtOrderLimit_Paymentmethods_N = (byte)(1) ;
      gxTv_SdtOrderLimit_Paymentmethods = null ;
   }

   public boolean getgxTv_SdtOrderLimit_Paymentmethods_IsNull( )
   {
      if ( gxTv_SdtOrderLimit_Paymentmethods == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtOrderLimit_Paymentmethods_N( )
   {
      return gxTv_SdtOrderLimit_Paymentmethods_N ;
   }

   public String getgxTv_SdtOrderLimit_Type( )
   {
      return gxTv_SdtOrderLimit_Type ;
   }

   public void setgxTv_SdtOrderLimit_Type( String value )
   {
      gxTv_SdtOrderLimit_Type = value ;
   }

   public String getgxTv_SdtOrderLimit_Value( )
   {
      return gxTv_SdtOrderLimit_Value ;
   }

   public void setgxTv_SdtOrderLimit_Value( String value )
   {
      gxTv_SdtOrderLimit_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtOrderLimit_Paymentmethods_N = (byte)(1) ;
      gxTv_SdtOrderLimit_Type = "" ;
      gxTv_SdtOrderLimit_Value = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtOrderLimit Clone( )
   {
      return (com.b2brestv1.accounts.SdtOrderLimit)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtOrderLimit struct )
   {
      setgxTv_SdtOrderLimit_Paymentmethods(new GXSimpleCollection<String>(String.class, "internal", "", struct.getPaymentmethods()));
      setgxTv_SdtOrderLimit_Type(struct.getType());
      setgxTv_SdtOrderLimit_Value(struct.getValue());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtOrderLimit getStruct( )
   {
      com.b2brestv1.accounts.StructSdtOrderLimit struct = new com.b2brestv1.accounts.StructSdtOrderLimit ();
      struct.setPaymentmethods(getgxTv_SdtOrderLimit_Paymentmethods().getStruct());
      struct.setType(getgxTv_SdtOrderLimit_Type());
      struct.setValue(getgxTv_SdtOrderLimit_Value());
      return struct ;
   }

   protected byte gxTv_SdtOrderLimit_Paymentmethods_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtOrderLimit_Value ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtOrderLimit_Type ;
   protected GXSimpleCollection<String> gxTv_SdtOrderLimit_Paymentmethods=null ;
}

