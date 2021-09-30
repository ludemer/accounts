/*
               File: accounts.SdtTermPeriod
        Description: TermPeriod
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.52
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

public final  class SdtTermPeriod extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtTermPeriod( )
   {
      this(  new ModelContext(SdtTermPeriod.class));
   }

   public SdtTermPeriod( ModelContext context )
   {
      super( context, "SdtTermPeriod");
   }

   public SdtTermPeriod( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtTermPeriod");
   }

   public SdtTermPeriod( StructSdtTermPeriod struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "days") )
            {
               gxTv_SdtTermPeriod_Days = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TermPeriod" ;
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
      oWriter.writeElement("days", GXutil.trim( GXutil.str( gxTv_SdtTermPeriod_Days, 5, 0)));
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
      AddObjectProperty("days", gxTv_SdtTermPeriod_Days, false, false);
   }

   public int getgxTv_SdtTermPeriod_Days( )
   {
      return gxTv_SdtTermPeriod_Days ;
   }

   public void setgxTv_SdtTermPeriod_Days( int value )
   {
      gxTv_SdtTermPeriod_Days = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtTermPeriod Clone( )
   {
      return (com.b2brestv1.accounts.SdtTermPeriod)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtTermPeriod struct )
   {
      setgxTv_SdtTermPeriod_Days(struct.getDays());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtTermPeriod getStruct( )
   {
      com.b2brestv1.accounts.StructSdtTermPeriod struct = new com.b2brestv1.accounts.StructSdtTermPeriod ();
      struct.setDays(getgxTv_SdtTermPeriod_Days());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtTermPeriod_Days ;
   protected String sTagName ;
   protected boolean formatError ;
}

