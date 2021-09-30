/*
               File: accounts.SdtAccountRequest_AccountRequestItem
        Description: AccountRequest
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:24.42
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

public final  class SdtAccountRequest_AccountRequestItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtAccountRequest_AccountRequestItem( )
   {
      this(  new ModelContext(SdtAccountRequest_AccountRequestItem.class));
   }

   public SdtAccountRequest_AccountRequestItem( ModelContext context )
   {
      super( context, "SdtAccountRequest_AccountRequestItem");
   }

   public SdtAccountRequest_AccountRequestItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtAccountRequest_AccountRequestItem");
   }

   public SdtAccountRequest_AccountRequestItem( StructSdtAccountRequest_AccountRequestItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "accountId") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Accountid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "channel") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Channel = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "deliveryAddress") )
            {
               if ( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress == null )
               {
                  gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress = new com.b2brestv1.accounts.SdtDeliveryAddress(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress.readxml(oReader, "deliveryAddress") ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "deliveryCenterId") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "deliveryRegion") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "deliveryRoute") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "deliveryScheduleId") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "erpSalesCenter") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "liquorLicense") )
            {
               if ( gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense == null )
               {
                  gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense = new GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem>(com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem.class, "xLiquorLicenseItem", "B2BRestV1", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense.readxml(oReader, "liquorLicense") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "liquorLicense") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "minimumOrder") )
            {
               if ( gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder == null )
               {
                  gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder = new com.b2brestv1.accounts.SdtOrderLimit(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder.readxml(oReader, "minimumOrder") ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "name") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "owner") )
            {
               if ( gxTv_SdtAccountRequest_AccountRequestItem_Owner == null )
               {
                  gxTv_SdtAccountRequest_AccountRequestItem_Owner = new com.b2brestv1.accounts.SdtOwner(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtAccountRequest_AccountRequestItem_Owner.readxml(oReader, "owner") ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "paymentMethods") )
            {
               if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods == null )
               {
                  gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods = new GXSimpleCollection<String>(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods.readxmlcollection(oReader, "paymentMethods", "Item") ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "paymentTerms") )
            {
               if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms == null )
               {
                  gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms = new GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem>(com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem.class, "PaymentTermItem", "B2BRestV1", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms.readxmlcollection(oReader, "paymentTerms", "Item") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "paymentTerms") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "potential") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Potential = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "priceListId") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "salesRepresentative") )
            {
               if ( gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative == null )
               {
                  gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative = new com.b2brestv1.accounts.SdtSalesRepresentative(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative.readxml(oReader, "salesRepresentative") ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "salesRoute") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Salesroute = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "segment") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Segment = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "status") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "subSegment") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Subsegment = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "taxId") )
            {
               gxTv_SdtAccountRequest_AccountRequestItem_Taxid = oReader.getValue() ;
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
         sName = "Accounts\\AccountRequest.AccountRequestItem" ;
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
      oWriter.writeElement("accountId", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Accountid));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("channel", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Channel));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress != null )
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
         gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress.writexml(oWriter, "deliveryAddress", sNameSpace1);
      }
      oWriter.writeElement("deliveryCenterId", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("deliveryRegion", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("deliveryRoute", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("deliveryScheduleId", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("erpSalesCenter", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense != null )
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
         gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense.writexml(oWriter, "liquorLicense", sNameSpace1, sIncludeState);
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder != null )
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
         gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder.writexml(oWriter, "minimumOrder", sNameSpace1);
      }
      oWriter.writeElement("name", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Name));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Owner != null )
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
         gxTv_SdtAccountRequest_AccountRequestItem_Owner.writexml(oWriter, "owner", sNameSpace1);
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods != null )
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
         gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods.writexmlcollection(oWriter, "paymentMethods", sNameSpace1, "Item", sNameSpace1);
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms != null )
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
         gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms.writexmlcollection(oWriter, "paymentTerms", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeElement("potential", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Potential));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("priceListId", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative != null )
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
         gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative.writexml(oWriter, "salesRepresentative", sNameSpace1);
      }
      oWriter.writeElement("salesRoute", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Salesroute));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("segment", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Segment));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("status", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Status));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("subSegment", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Subsegment));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("taxId", GXutil.rtrim( gxTv_SdtAccountRequest_AccountRequestItem_Taxid));
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
      AddObjectProperty("accountId", gxTv_SdtAccountRequest_AccountRequestItem_Accountid, false, false);
      AddObjectProperty("channel", gxTv_SdtAccountRequest_AccountRequestItem_Channel, false, false);
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress != null )
      {
         AddObjectProperty("deliveryAddress", gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress, false, false);
      }
      AddObjectProperty("deliveryCenterId", gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid, false, false);
      AddObjectProperty("deliveryRegion", gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion, false, false);
      AddObjectProperty("deliveryRoute", gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute, false, false);
      AddObjectProperty("deliveryScheduleId", gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid, false, false);
      AddObjectProperty("erpSalesCenter", gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter, false, false);
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense != null )
      {
         AddObjectProperty("liquorLicense", gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense, false, false);
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder != null )
      {
         AddObjectProperty("minimumOrder", gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder, false, false);
      }
      AddObjectProperty("name", gxTv_SdtAccountRequest_AccountRequestItem_Name, false, false);
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Owner != null )
      {
         AddObjectProperty("owner", gxTv_SdtAccountRequest_AccountRequestItem_Owner, false, false);
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods != null )
      {
         AddObjectProperty("paymentMethods", gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods, false, false);
      }
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms != null )
      {
         AddObjectProperty("paymentTerms", gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms, false, false);
      }
      AddObjectProperty("potential", gxTv_SdtAccountRequest_AccountRequestItem_Potential, false, false);
      AddObjectProperty("priceListId", gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid, false, false);
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative != null )
      {
         AddObjectProperty("salesRepresentative", gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative, false, false);
      }
      AddObjectProperty("salesRoute", gxTv_SdtAccountRequest_AccountRequestItem_Salesroute, false, false);
      AddObjectProperty("segment", gxTv_SdtAccountRequest_AccountRequestItem_Segment, false, false);
      AddObjectProperty("status", gxTv_SdtAccountRequest_AccountRequestItem_Status, false, false);
      AddObjectProperty("subSegment", gxTv_SdtAccountRequest_AccountRequestItem_Subsegment, false, false);
      AddObjectProperty("taxId", gxTv_SdtAccountRequest_AccountRequestItem_Taxid, false, false);
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Accountid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Accountid ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Accountid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Accountid = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Channel( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Channel ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Channel( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Channel = value ;
   }

   public com.b2brestv1.accounts.SdtDeliveryAddress getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress == null )
      {
         gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress = new com.b2brestv1.accounts.SdtDeliveryAddress(remoteHandle, context);
      }
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N = (byte)(0) ;
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress( com.b2brestv1.accounts.SdtDeliveryAddress value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress = value;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_SetNull( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress = (com.b2brestv1.accounts.SdtDeliveryAddress)null;
   }

   public boolean getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_IsNull( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter = value ;
   }

   public GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem> getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense == null )
      {
         gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense = new GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem>(com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem.class, "xLiquorLicenseItem", "B2BRestV1", remoteHandle);
      }
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N = (byte)(0) ;
      return gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense( GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem> value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense = value ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_SetNull( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense = null ;
   }

   public boolean getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_IsNull( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N ;
   }

   public com.b2brestv1.accounts.SdtOrderLimit getgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder == null )
      {
         gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder = new com.b2brestv1.accounts.SdtOrderLimit(remoteHandle, context);
      }
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N = (byte)(0) ;
      return gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder( com.b2brestv1.accounts.SdtOrderLimit value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder = value;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_SetNull( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder = (com.b2brestv1.accounts.SdtOrderLimit)null;
   }

   public boolean getgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_IsNull( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Name( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Name ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Name( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Name = value ;
   }

   public com.b2brestv1.accounts.SdtOwner getgxTv_SdtAccountRequest_AccountRequestItem_Owner( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Owner == null )
      {
         gxTv_SdtAccountRequest_AccountRequestItem_Owner = new com.b2brestv1.accounts.SdtOwner(remoteHandle, context);
      }
      gxTv_SdtAccountRequest_AccountRequestItem_Owner_N = (byte)(0) ;
      return gxTv_SdtAccountRequest_AccountRequestItem_Owner ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Owner( com.b2brestv1.accounts.SdtOwner value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Owner_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Owner = value;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Owner_SetNull( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Owner_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Owner = (com.b2brestv1.accounts.SdtOwner)null;
   }

   public boolean getgxTv_SdtAccountRequest_AccountRequestItem_Owner_IsNull( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Owner == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAccountRequest_AccountRequestItem_Owner_N( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Owner_N ;
   }

   public GXSimpleCollection<String> getgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods == null )
      {
         gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods = new GXSimpleCollection<String>(String.class, "internal", "");
      }
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N = (byte)(0) ;
      return gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods( GXSimpleCollection<String> value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods = value ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_SetNull( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods = null ;
   }

   public boolean getgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_IsNull( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N ;
   }

   public GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem> getgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms == null )
      {
         gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms = new GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem>(com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem.class, "PaymentTermItem", "B2BRestV1", remoteHandle);
      }
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N = (byte)(0) ;
      return gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms( GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem> value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms = value ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_SetNull( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms = null ;
   }

   public boolean getgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_IsNull( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Potential( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Potential ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Potential( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Potential = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Pricelistid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Pricelistid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid = value ;
   }

   public com.b2brestv1.accounts.SdtSalesRepresentative getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative == null )
      {
         gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative = new com.b2brestv1.accounts.SdtSalesRepresentative(remoteHandle, context);
      }
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N = (byte)(0) ;
      return gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative( com.b2brestv1.accounts.SdtSalesRepresentative value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N = (byte)(0) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative = value;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_SetNull( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative = (com.b2brestv1.accounts.SdtSalesRepresentative)null;
   }

   public boolean getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_IsNull( )
   {
      if ( gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Salesroute( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Salesroute ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Salesroute( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Salesroute = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Segment( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Segment ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Segment( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Segment = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Status( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Status ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Status( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Status = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Subsegment( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Subsegment ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Subsegment( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Subsegment = value ;
   }

   public String getgxTv_SdtAccountRequest_AccountRequestItem_Taxid( )
   {
      return gxTv_SdtAccountRequest_AccountRequestItem_Taxid ;
   }

   public void setgxTv_SdtAccountRequest_AccountRequestItem_Taxid( String value )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Taxid = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtAccountRequest_AccountRequestItem_Accountid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Channel = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Name = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Owner_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Potential = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N = (byte)(1) ;
      gxTv_SdtAccountRequest_AccountRequestItem_Salesroute = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Segment = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Status = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Subsegment = "" ;
      gxTv_SdtAccountRequest_AccountRequestItem_Taxid = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem Clone( )
   {
      return (com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtAccountRequest_AccountRequestItem struct )
   {
      setgxTv_SdtAccountRequest_AccountRequestItem_Accountid(struct.getAccountid());
      setgxTv_SdtAccountRequest_AccountRequestItem_Channel(struct.getChannel());
      setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress(new com.b2brestv1.accounts.SdtDeliveryAddress(struct.getDeliveryaddress()));
      setgxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid(struct.getDeliverycenterid());
      setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion(struct.getDeliveryregion());
      setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute(struct.getDeliveryroute());
      setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid(struct.getDeliveryscheduleid());
      setgxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter(struct.getErpsalescenter());
      GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem> gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux = new GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem>(com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem.class, "xLiquorLicenseItem", "B2BRestV1", remoteHandle);
      Vector<com.b2brestv1.accounts.StructSdtxLiquorLicense_xLiquorLicenseItem> gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux1 = struct.getLiquorlicense();
      if (gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux1.size(); i++)
         {
            gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux.add(new com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem(gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense(gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux);
      setgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder(new com.b2brestv1.accounts.SdtOrderLimit(struct.getMinimumorder()));
      setgxTv_SdtAccountRequest_AccountRequestItem_Name(struct.getName());
      setgxTv_SdtAccountRequest_AccountRequestItem_Owner(new com.b2brestv1.accounts.SdtOwner(struct.getOwner()));
      setgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods(new GXSimpleCollection<String>(String.class, "internal", "", struct.getPaymentmethods()));
      GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem> gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux = new GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem>(com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem.class, "PaymentTermItem", "B2BRestV1", remoteHandle);
      Vector<com.b2brestv1.accounts.StructSdtPaymentTerm_PaymentTermItem> gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux1 = struct.getPaymentterms();
      if (gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux1.size(); i++)
         {
            gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux.add(new com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem(gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms(gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux);
      setgxTv_SdtAccountRequest_AccountRequestItem_Potential(struct.getPotential());
      setgxTv_SdtAccountRequest_AccountRequestItem_Pricelistid(struct.getPricelistid());
      setgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative(new com.b2brestv1.accounts.SdtSalesRepresentative(struct.getSalesrepresentative()));
      setgxTv_SdtAccountRequest_AccountRequestItem_Salesroute(struct.getSalesroute());
      setgxTv_SdtAccountRequest_AccountRequestItem_Segment(struct.getSegment());
      setgxTv_SdtAccountRequest_AccountRequestItem_Status(struct.getStatus());
      setgxTv_SdtAccountRequest_AccountRequestItem_Subsegment(struct.getSubsegment());
      setgxTv_SdtAccountRequest_AccountRequestItem_Taxid(struct.getTaxid());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtAccountRequest_AccountRequestItem getStruct( )
   {
      com.b2brestv1.accounts.StructSdtAccountRequest_AccountRequestItem struct = new com.b2brestv1.accounts.StructSdtAccountRequest_AccountRequestItem ();
      struct.setAccountid(getgxTv_SdtAccountRequest_AccountRequestItem_Accountid());
      struct.setChannel(getgxTv_SdtAccountRequest_AccountRequestItem_Channel());
      struct.setDeliveryaddress(getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().getStruct());
      struct.setDeliverycenterid(getgxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid());
      struct.setDeliveryregion(getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion());
      struct.setDeliveryroute(getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute());
      struct.setDeliveryscheduleid(getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid());
      struct.setErpsalescenter(getgxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter());
      struct.setLiquorlicense(getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().getStruct());
      struct.setMinimumorder(getgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder().getStruct());
      struct.setName(getgxTv_SdtAccountRequest_AccountRequestItem_Name());
      struct.setOwner(getgxTv_SdtAccountRequest_AccountRequestItem_Owner().getStruct());
      struct.setPaymentmethods(getgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods().getStruct());
      struct.setPaymentterms(getgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms().getStruct());
      struct.setPotential(getgxTv_SdtAccountRequest_AccountRequestItem_Potential());
      struct.setPricelistid(getgxTv_SdtAccountRequest_AccountRequestItem_Pricelistid());
      struct.setSalesrepresentative(getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().getStruct());
      struct.setSalesroute(getgxTv_SdtAccountRequest_AccountRequestItem_Salesroute());
      struct.setSegment(getgxTv_SdtAccountRequest_AccountRequestItem_Segment());
      struct.setStatus(getgxTv_SdtAccountRequest_AccountRequestItem_Status());
      struct.setSubsegment(getgxTv_SdtAccountRequest_AccountRequestItem_Subsegment());
      struct.setTaxid(getgxTv_SdtAccountRequest_AccountRequestItem_Taxid());
      return struct ;
   }

   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Owner_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_N ;
   protected byte gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Accountid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Channel ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Name ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Potential ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Pricelistid ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Salesroute ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Segment ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Status ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Subsegment ;
   protected String gxTv_SdtAccountRequest_AccountRequestItem_Taxid ;
   protected GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem> gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense_aux ;
   protected GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem> gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms_aux ;
   protected GXSimpleCollection<String> gxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods=null ;
   protected GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem> gxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense=null ;
   protected GXBaseCollection<com.b2brestv1.accounts.SdtPaymentTerm_PaymentTermItem> gxTv_SdtAccountRequest_AccountRequestItem_Paymentterms=null ;
   protected com.b2brestv1.accounts.SdtDeliveryAddress gxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress=null ;
   protected com.b2brestv1.accounts.SdtOrderLimit gxTv_SdtAccountRequest_AccountRequestItem_Minimumorder=null ;
   protected com.b2brestv1.accounts.SdtOwner gxTv_SdtAccountRequest_AccountRequestItem_Owner=null ;
   protected com.b2brestv1.accounts.SdtSalesRepresentative gxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative=null ;
}

