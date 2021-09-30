/*
               File: accounts.SdtPaymentTerm_PaymentTermItem
        Description: PaymentTerm
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.94
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

public final  class SdtPaymentTerm_PaymentTermItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtPaymentTerm_PaymentTermItem( )
   {
      this(  new ModelContext(SdtPaymentTerm_PaymentTermItem.class));
   }

   public SdtPaymentTerm_PaymentTermItem( ModelContext context )
   {
      super( context, "SdtPaymentTerm_PaymentTermItem");
   }

   public SdtPaymentTerm_PaymentTermItem( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtPaymentTerm_PaymentTermItem");
   }

   public SdtPaymentTerm_PaymentTermItem( StructSdtPaymentTerm_PaymentTermItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "termPeriods") )
            {
               if ( gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods == null )
               {
                  gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods = new GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod>(com.b2brestv1.accounts.SdtTermPeriod.class, "TermPeriod", "B2BRestV1", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods.readxmlcollection(oReader, "termPeriods", "Item") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "termPeriods") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "type") )
            {
               gxTv_SdtPaymentTerm_PaymentTermItem_Type = oReader.getValue() ;
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
         sName = "Accounts\\PaymentTerm.PaymentTermItem" ;
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
      if ( gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods != null )
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
         gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods.writexmlcollection(oWriter, "termPeriods", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeElement("type", GXutil.rtrim( gxTv_SdtPaymentTerm_PaymentTermItem_Type));
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
      if ( gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods != null )
      {
         AddObjectProperty("termPeriods", gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods, false, false);
      }
      AddObjectProperty("type", gxTv_SdtPaymentTerm_PaymentTermItem_Type, false, false);
   }

   public GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod> getgxTv_SdtPaymentTerm_PaymentTermItem_Termperiods( )
   {
      if ( gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods == null )
      {
         gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods = new GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod>(com.b2brestv1.accounts.SdtTermPeriod.class, "TermPeriod", "B2BRestV1", remoteHandle);
      }
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N = (byte)(0) ;
      return gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods ;
   }

   public void setgxTv_SdtPaymentTerm_PaymentTermItem_Termperiods( GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod> value )
   {
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N = (byte)(0) ;
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods = value ;
   }

   public void setgxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_SetNull( )
   {
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N = (byte)(1) ;
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods = null ;
   }

   public boolean getgxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_IsNull( )
   {
      if ( gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N( )
   {
      return gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N ;
   }

   public String getgxTv_SdtPaymentTerm_PaymentTermItem_Type( )
   {
      return gxTv_SdtPaymentTerm_PaymentTermItem_Type ;
   }

   public void setgxTv_SdtPaymentTerm_PaymentTermItem_Type( String value )
   {
      gxTv_SdtPaymentTerm_PaymentTermItem_Type = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N = (byte)(1) ;
      gxTv_SdtPaymentTerm_PaymentTermItem_Type = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem Clone( )
   {
      return (com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem struct )
   {
      GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod> gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux = new GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod>(com.b2brestv1.accounts.SdtTermPeriod.class, "TermPeriod", "B2BRestV1", remoteHandle);
      Vector<com.b2brestv1.accounts.StructSdtTermPeriod> gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux1 = struct.getTermperiods();
      if (gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux1.size(); i++)
         {
            gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux.add(new com.b2brestv1.accounts.SdtTermPeriod(gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPaymentTerm_PaymentTermItem_Termperiods(gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux);
      setgxTv_SdtPaymentTerm_PaymentTermItem_Type(struct.getType());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem getStruct( )
   {
      com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem struct = new com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem ();
      struct.setTermperiods(getgxTv_SdtPaymentTerm_PaymentTermItem_Termperiods().getStruct());
      struct.setType(getgxTv_SdtPaymentTerm_PaymentTermItem_Type());
      return struct ;
   }

   protected byte gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtPaymentTerm_PaymentTermItem_Type ;
   protected GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod> gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods_aux ;
   protected GXBaseCollection<com.b2brestv1.accounts.SdtTermPeriod> gxTv_SdtPaymentTerm_PaymentTermItem_Termperiods=null ;
}

