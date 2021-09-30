/*
               File: accounts.SdtDeliveryAddress
        Description: DeliveryAddress
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:24.28
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

public final  class SdtDeliveryAddress extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtDeliveryAddress( )
   {
      this(  new ModelContext(SdtDeliveryAddress.class));
   }

   public SdtDeliveryAddress( ModelContext context )
   {
      super( context, "SdtDeliveryAddress");
   }

   public SdtDeliveryAddress( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtDeliveryAddress");
   }

   public SdtDeliveryAddress( StructSdtDeliveryAddress struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "address") )
            {
               gxTv_SdtDeliveryAddress_Address = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "city") )
            {
               gxTv_SdtDeliveryAddress_City = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "latitude") )
            {
               gxTv_SdtDeliveryAddress_Latitude = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "longitude") )
            {
               gxTv_SdtDeliveryAddress_Longitude = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "state") )
            {
               gxTv_SdtDeliveryAddress_State = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "zipcode") )
            {
               gxTv_SdtDeliveryAddress_Zipcode = oReader.getValue() ;
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
         sName = "DeliveryAddress" ;
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
      oWriter.writeElement("address", GXutil.rtrim( gxTv_SdtDeliveryAddress_Address));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("city", GXutil.rtrim( gxTv_SdtDeliveryAddress_City));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("latitude", GXutil.rtrim( gxTv_SdtDeliveryAddress_Latitude));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("longitude", GXutil.rtrim( gxTv_SdtDeliveryAddress_Longitude));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("state", GXutil.rtrim( gxTv_SdtDeliveryAddress_State));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("zipcode", GXutil.rtrim( gxTv_SdtDeliveryAddress_Zipcode));
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
      AddObjectProperty("address", gxTv_SdtDeliveryAddress_Address, false, false);
      AddObjectProperty("city", gxTv_SdtDeliveryAddress_City, false, false);
      AddObjectProperty("latitude", gxTv_SdtDeliveryAddress_Latitude, false, false);
      AddObjectProperty("longitude", gxTv_SdtDeliveryAddress_Longitude, false, false);
      AddObjectProperty("state", gxTv_SdtDeliveryAddress_State, false, false);
      AddObjectProperty("zipcode", gxTv_SdtDeliveryAddress_Zipcode, false, false);
   }

   public String getgxTv_SdtDeliveryAddress_Address( )
   {
      return gxTv_SdtDeliveryAddress_Address ;
   }

   public void setgxTv_SdtDeliveryAddress_Address( String value )
   {
      gxTv_SdtDeliveryAddress_Address = value ;
   }

   public String getgxTv_SdtDeliveryAddress_City( )
   {
      return gxTv_SdtDeliveryAddress_City ;
   }

   public void setgxTv_SdtDeliveryAddress_City( String value )
   {
      gxTv_SdtDeliveryAddress_City = value ;
   }

   public String getgxTv_SdtDeliveryAddress_Latitude( )
   {
      return gxTv_SdtDeliveryAddress_Latitude ;
   }

   public void setgxTv_SdtDeliveryAddress_Latitude( String value )
   {
      gxTv_SdtDeliveryAddress_Latitude = value ;
   }

   public String getgxTv_SdtDeliveryAddress_Longitude( )
   {
      return gxTv_SdtDeliveryAddress_Longitude ;
   }

   public void setgxTv_SdtDeliveryAddress_Longitude( String value )
   {
      gxTv_SdtDeliveryAddress_Longitude = value ;
   }

   public String getgxTv_SdtDeliveryAddress_State( )
   {
      return gxTv_SdtDeliveryAddress_State ;
   }

   public void setgxTv_SdtDeliveryAddress_State( String value )
   {
      gxTv_SdtDeliveryAddress_State = value ;
   }

   public String getgxTv_SdtDeliveryAddress_Zipcode( )
   {
      return gxTv_SdtDeliveryAddress_Zipcode ;
   }

   public void setgxTv_SdtDeliveryAddress_Zipcode( String value )
   {
      gxTv_SdtDeliveryAddress_Zipcode = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDeliveryAddress_Address = "" ;
      gxTv_SdtDeliveryAddress_City = "" ;
      gxTv_SdtDeliveryAddress_Latitude = "" ;
      gxTv_SdtDeliveryAddress_Longitude = "" ;
      gxTv_SdtDeliveryAddress_State = "" ;
      gxTv_SdtDeliveryAddress_Zipcode = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtDeliveryAddress Clone( )
   {
      return (com.b2brestv1.accounts.SdtDeliveryAddress)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtDeliveryAddress struct )
   {
      setgxTv_SdtDeliveryAddress_Address(struct.getAddress());
      setgxTv_SdtDeliveryAddress_City(struct.getCity());
      setgxTv_SdtDeliveryAddress_Latitude(struct.getLatitude());
      setgxTv_SdtDeliveryAddress_Longitude(struct.getLongitude());
      setgxTv_SdtDeliveryAddress_State(struct.getState());
      setgxTv_SdtDeliveryAddress_Zipcode(struct.getZipcode());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtDeliveryAddress getStruct( )
   {
      com.b2brestv1.accounts.StructSdtDeliveryAddress struct = new com.b2brestv1.accounts.StructSdtDeliveryAddress ();
      struct.setAddress(getgxTv_SdtDeliveryAddress_Address());
      struct.setCity(getgxTv_SdtDeliveryAddress_City());
      struct.setLatitude(getgxTv_SdtDeliveryAddress_Latitude());
      struct.setLongitude(getgxTv_SdtDeliveryAddress_Longitude());
      struct.setState(getgxTv_SdtDeliveryAddress_State());
      struct.setZipcode(getgxTv_SdtDeliveryAddress_Zipcode());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtDeliveryAddress_Address ;
   protected String gxTv_SdtDeliveryAddress_City ;
   protected String gxTv_SdtDeliveryAddress_Latitude ;
   protected String gxTv_SdtDeliveryAddress_Longitude ;
   protected String gxTv_SdtDeliveryAddress_State ;
   protected String gxTv_SdtDeliveryAddress_Zipcode ;
}

