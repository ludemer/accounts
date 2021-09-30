/*
               File: sndUpdatedAccounts
        Description: snd Updated Accounts
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.57
       Program type: Main program
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class asndupdatedaccounts extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.b2brestv1.GXcfg.class);
      asndupdatedaccounts pgm = new asndupdatedaccounts (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      int aP2 = 0;
      boolean aP3 = false;
      boolean aP4 = false;

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (int) GXutil.lval( args[2]);
         aP3 = (boolean) GXutil.boolval( args[3]);
         aP4 = (boolean) GXutil.boolval( args[4]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public asndupdatedaccounts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( asndupdatedaccounts.class ), "" );
   }

   public asndupdatedaccounts( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        boolean aP3 ,
                        boolean aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             boolean aP3 ,
                             boolean aP4 )
   {
      asndupdatedaccounts.this.AV19env = aP0;
      asndupdatedaccounts.this.AV15country = aP1;
      asndupdatedaccounts.this.AV16cuantos = aP2;
      asndupdatedaccounts.this.AV18debug = aP3;
      asndupdatedaccounts.this.AV50MuestraUltimoSQLID = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( "Init" );
      /* Execute user subroutine: 'INICIALIZACION' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV50MuestraUltimoSQLID )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P00422 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV46SQLID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A268fcxvISDELETED = P00422_A268fcxvISDELETED[0] ;
         n268fcxvISDELETED = P00422_n268fcxvISDELETED[0] ;
         A267fcxvSQLID = P00422_A267fcxvSQLID[0] ;
         A269fcxvCLIID = P00422_A269fcxvCLIID[0] ;
         n269fcxvCLIID = P00422_n269fcxvCLIID[0] ;
         A387fcxvCLINOM = P00422_A387fcxvCLINOM[0] ;
         A390fcxvDIR = P00422_A390fcxvDIR[0] ;
         A391fcxvCITY = P00422_A391fcxvCITY[0] ;
         A392fcxvSTATE = P00422_A392fcxvSTATE[0] ;
         A393fcxvZIPCODE = P00422_A393fcxvZIPCODE[0] ;
         A412fcxvCENTRO = P00422_A412fcxvCENTRO[0] ;
         A409fcxvTPOCODID = P00422_A409fcxvTPOCODID[0] ;
         A406fcxvCUIT = P00422_A406fcxvCUIT[0] ;
         A405fcxvDIVISION = P00422_A405fcxvDIVISION[0] ;
         A1183fcxvREGID = P00422_A1183fcxvREGID[0] ;
         A394fcxvTERRITORIO = P00422_A394fcxvTERRITORIO[0] ;
         A414fcxvDISTRIBUTIONCHANNEL = P00422_A414fcxvDISTRIBUTIONCHANNEL[0] ;
         A435fcxvAUTALC = P00422_A435fcxvAUTALC[0] ;
         A396fcxvVDRNOM = P00422_A396fcxvVDRNOM[0] ;
         A397fcxvVDREMA = P00422_A397fcxvVDREMA[0] ;
         A398fcxvVDRTEL = P00422_A398fcxvVDRTEL[0] ;
         A411fcxvLISTID = P00422_A411fcxvLISTID[0] ;
         A1200fcxvDRPMIN = P00422_A1200fcxvDRPMIN[0] ;
         A435fcxvAUTALC = P00422_A435fcxvAUTALC[0] ;
         AV10AccountItem = (com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem)new com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem(remoteHandle, context);
         AV37nro = (int)(AV37nro+1) ;
         AV12CLIID = A269fcxvCLIID ;
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Accountid( GXutil.trim( GXutil.str( A269fcxvCLIID, 6, 0)) );
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Name( GXutil.trim( A387fcxvCLINOM) );
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_Address( GXutil.substring( A390fcxvDIR, 1, GXutil.strSearchRev( A390fcxvDIR, ",", -1)-1) );
         if ( GXutil.strcmp(GXutil.trim( AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().getgxTv_SdtDeliveryAddress_Address()), "") == 0 )
         {
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new com.b2brestv1.servicioscomunes.chrnull(remoteHandle, context).execute( GXv_char2) ;
            asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_Address( GXt_char1 );
         }
         if ( GXutil.strcmp(GXutil.trim( A391fcxvCITY), "") == 0 )
         {
            if ( GXutil.strcmp(AV15country, "AR") == 0 )
            {
               AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion( "Bs As" );
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_City( "Bs As" );
            }
            else if ( GXutil.strcmp(AV15country, "PY") == 0 )
            {
               AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion( "Santiago" );
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_City( "Santiago" );
            }
            else if ( GXutil.strcmp(AV15country, "UY") == 0 )
            {
               AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion( "Montevideo" );
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_City( "Montevideo" );
            }
         }
         else
         {
            AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryregion( GXutil.trim( A391fcxvCITY) );
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_City( GXutil.trim( A391fcxvCITY) );
         }
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_State( GXutil.trim( A392fcxvSTATE) );
         if ( GXutil.strcmp(GXutil.trim( A393fcxvZIPCODE), "") == 0 )
         {
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_Zipcode( "0" );
         }
         else
         {
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_Zipcode( GXutil.trim( A393fcxvZIPCODE) );
         }
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryroute( AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().getgxTv_SdtDeliveryAddress_Zipcode() );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new com.b2brestv1.servicioscomunes.chrnull(remoteHandle, context).execute( GXv_char2) ;
         asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_Latitude( GXt_char1 );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new com.b2brestv1.servicioscomunes.chrnull(remoteHandle, context).execute( GXv_char2) ;
         asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Deliveryaddress().setgxTv_SdtDeliveryAddress_Longitude( GXt_char1 );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new com.b2brestv1.servicioscomunes.chrnull(remoteHandle, context).execute( GXv_char2) ;
         asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Potential( GXt_char1 );
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliverycenterid( GXutil.trim( A412fcxvCENTRO) );
         if ( (GXutil.strcmp("", A409fcxvTPOCODID)==0) )
         {
            AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid( "DW-"+GXutil.trim( GXutil.str( A269fcxvCLIID, 6, 0)) );
         }
         else
         {
            AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Deliveryscheduleid( "DW-"+GXutil.trim( A409fcxvTPOCODID) );
         }
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Taxid( GXutil.trim( A406fcxvCUIT) );
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Channel( GXutil.str( A405fcxvDIVISION, 3, 0) );
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Erpsalescenter( GXutil.trim( GXutil.str( A1183fcxvREGID, 5, 0)) );
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Salesroute( GXutil.trim( GXutil.str( A394fcxvTERRITORIO, 5, 0)) );
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Segment( GXutil.trim( A414fcxvDISTRIBUTIONCHANNEL) );
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Subsegment( GXutil.trim( GXutil.str( A405fcxvDIVISION, 3, 0)) );
         if ( GXutil.strcmp(A435fcxvAUTALC, "S") == 0 )
         {
            AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense( new GXBaseCollection<com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem>(com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem.class, "xLiquorLicenseItem", "B2BRestV1", remoteHandle) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new com.b2brestv1.servicioscomunes.chrnull(remoteHandle, context).execute( GXv_char2) ;
            asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
            ((com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem)(AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().currentItem())).setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Description( GXt_char1 );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new com.b2brestv1.servicioscomunes.chrnull(remoteHandle, context).execute( GXv_char2) ;
            asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
            ((com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem)(AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().currentItem())).setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Expirationdate( GXt_char1 );
            ((com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem)(AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().currentItem())).setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Number( GXutil.trim( A406fcxvCUIT) );
            ((com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem)(AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().currentItem())).setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Status( "VALID" );
            ((com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem)(AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().currentItem())).setgxTv_SdtxLiquorLicense_xLiquorLicenseItem_Type( "PERMANENT" );
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().add(((com.b2brestv1.accounts.SdtxLiquorLicense_xLiquorLicenseItem)(AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Liquorlicense().currentItem())).Clone(), 0);
         }
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Name( GXutil.trim( A396fcxvVDRNOM) );
         if ( GXutil.strcmp(GXutil.trim( A397fcxvVDREMA), "") == 0 )
         {
            if ( GXutil.strcmp(AV15country, "AR") == 0 )
            {
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Email( "atencionaclientes@quilmes.com.ar " );
            }
            else if ( GXutil.strcmp(AV15country, "PY") == 0 )
            {
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Email( "atencionalcliente@cervepar.com.py" );
            }
            else if ( GXutil.strcmp(AV15country, "UY") == 0 )
            {
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Email( "" );
            }
         }
         else
         {
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Email( GXutil.trim( A397fcxvVDREMA) );
         }
         if ( GXutil.strcmp(GXutil.trim( A398fcxvVDRTEL), "") == 0 )
         {
            if ( GXutil.strcmp(AV15country, "AR") == 0 )
            {
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Phone( "08102221234" );
            }
            else if ( GXutil.strcmp(AV15country, "PY") == 0 )
            {
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new com.b2brestv1.servicioscomunes.chrnull(remoteHandle, context).execute( GXv_char2) ;
               asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Phone( GXt_char1 );
            }
            else if ( GXutil.strcmp(AV15country, "UY") == 0 )
            {
               AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Phone( "*3223" );
            }
         }
         else
         {
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Salesrepresentative().setgxTv_SdtSalesRepresentative_Phone( GXutil.trim( A398fcxvVDRTEL) );
         }
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Paymentmethods().add("CASH", 0);
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Paymentterms().clear();
         if ( GXutil.strcmp(A268fcxvISDELETED, "TRUE") == 0 )
         {
            AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Status( "BLOCKED" );
         }
         else
         {
            AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Status( "ACTIVE" );
         }
         AV10AccountItem.setgxTv_SdtAccountRequest_AccountRequestItem_Pricelistid( GXutil.trim( A411fcxvLISTID) );
         AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder().setgxTv_SdtOrderLimit_Type( "ORDER_TOTAL" );
         if ( GXutil.strcmp(AV15country, "PY") == 0 )
         {
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder().setgxTv_SdtOrderLimit_Value( "100000" );
         }
         else
         {
            AV10AccountItem.getgxTv_SdtAccountRequest_AccountRequestItem_Minimumorder().setgxTv_SdtOrderLimit_Value( GXutil.trim( GXutil.str( A1200fcxvDRPMIN, 18, 2)) );
         }
         AV9accou.add(AV10AccountItem, 0);
         AV49b2blUltimoSQLID = A267fcxvSQLID ;
         if ( AV37nro == AV16cuantos )
         {
            if ( AV18debug )
            {
               AV44now = GXutil.now( ) ;
               AV45mensaje += "Mando:" + GXutil.trim( localUtil.ttoc( AV44now, 8, 8, 1, 2, "/", ":", " ")) ;
               AV52ids.clear();
               new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV58Pgmname, AV48Api, AV15country, AV19env, AV45mensaje, AV52ids) ;
               AV52ids.clear();
            }
            /* Execute user subroutine: 'MANDO' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV9accou = new GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem>(com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem.class, "AccountRequestItem", "B2BRestV1", remoteHandle) ;
            AV37nro = 0 ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV9accou.size() > 0 )
      {
         /* Execute user subroutine: 'MANDO' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      System.out.println( "Close" );
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIALIZACION' Routine */
      returnInSub = false ;
      AV24licfec = GXutil.str( GXutil.year( Gx_date), 10, 0) + GXutil.padl( GXutil.str( GXutil.month( Gx_date), 10, 0), (short)(2), "0") + GXutil.padl( GXutil.str( GXutil.day( Gx_date), 10, 0), (short)(2), "0") ;
      if ( AV18debug )
      {
         AV44now = GXutil.now( ) ;
         AV45mensaje = "Inicio: " + GXutil.trim( localUtil.ttoc( AV44now, 8, 8, 1, 2, "/", ":", " ")) + GXutil.newLine( ) ;
         System.out.println( AV45mensaje );
      }
      AV48Api = "CreateAccountUsingPOST" ;
      GXt_int3 = AV46SQLID ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.b2brestv1.accounts.apibaseurl(remoteHandle, context).execute( AV19env, GXv_char2) ;
      asndupdatedaccounts.this.GXt_char1 = GXv_char2[0] ;
      GXv_int4[0] = GXt_int3 ;
      new com.b2brestv1.servicioscomunes.traeultimosqlid(remoteHandle, context).execute( "POST", GXt_char1+"/", AV48Api, AV15country, GXv_int4) ;
      asndupdatedaccounts.this.GXt_int3 = GXv_int4[0] ;
      AV46SQLID = GXt_int3 ;
      AV52ids.clear();
      AV52ids.add("Ultimo SQLID:"+GXutil.str( AV46SQLID, 18, 0), 0);
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV58Pgmname, AV48Api, AV15country, AV19env, "Inicia SndUpdatedAccounts", AV52ids) ;
      AV52ids.clear();
   }

   public void S121( )
   {
      /* 'MANDO' Routine */
      returnInSub = false ;
      if ( AV18debug )
      {
         AV52ids.clear();
         new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV58Pgmname, AV48Api, AV15country, AV19env, AV9accou.toJSonString(false), AV52ids) ;
      }
      else
      {
         GXv_char2[0] = AV54tokenRecibido ;
         new com.b2brestv1.openapicommon.authusr(remoteHandle, context).execute( AV19env, AV15country, GXv_char2) ;
         asndupdatedaccounts.this.AV54tokenRecibido = GXv_char2[0] ;
         if ( (GXutil.strcmp("", AV54tokenRecibido)==0) )
         {
            new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV58Pgmname, AV48Api, AV15country, AV19env, "Error WS Token sin retorno", AV52ids) ;
            System.out.println( "Error al consumir el WS Token" );
            returnInSub = true;
            if (true) return;
         }
         else
         {
            GXv_SdtMessages_Message5[0] = AV35message;
            GXv_boolean6[0] = AV41success ;
            new com.b2brestv1.accounts.createaccountusingpost(remoteHandle, context).execute( AV19env, AV54tokenRecibido, AV48Api, AV49b2blUltimoSQLID, AV9accou, AV15country, "", "", GXv_SdtMessages_Message5, GXv_boolean6) ;
            AV35message = GXv_SdtMessages_Message5[0] ;
            asndupdatedaccounts.this.AV41success = GXv_boolean6[0] ;
         }
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(sndupdatedaccounts.class);
      return new com.b2brestv1.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00422_A268fcxvISDELETED = new String[] {""} ;
      P00422_n268fcxvISDELETED = new boolean[] {false} ;
      P00422_A267fcxvSQLID = new long[1] ;
      P00422_A269fcxvCLIID = new int[1] ;
      P00422_n269fcxvCLIID = new boolean[] {false} ;
      P00422_A387fcxvCLINOM = new String[] {""} ;
      P00422_A390fcxvDIR = new String[] {""} ;
      P00422_A391fcxvCITY = new String[] {""} ;
      P00422_A392fcxvSTATE = new String[] {""} ;
      P00422_A393fcxvZIPCODE = new String[] {""} ;
      P00422_A412fcxvCENTRO = new String[] {""} ;
      P00422_A409fcxvTPOCODID = new String[] {""} ;
      P00422_A406fcxvCUIT = new String[] {""} ;
      P00422_A405fcxvDIVISION = new short[1] ;
      P00422_A1183fcxvREGID = new int[1] ;
      P00422_A394fcxvTERRITORIO = new int[1] ;
      P00422_A414fcxvDISTRIBUTIONCHANNEL = new String[] {""} ;
      P00422_A435fcxvAUTALC = new String[] {""} ;
      P00422_A396fcxvVDRNOM = new String[] {""} ;
      P00422_A397fcxvVDREMA = new String[] {""} ;
      P00422_A398fcxvVDRTEL = new String[] {""} ;
      P00422_A411fcxvLISTID = new String[] {""} ;
      P00422_A1200fcxvDRPMIN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A268fcxvISDELETED = "" ;
      A387fcxvCLINOM = "" ;
      A390fcxvDIR = "" ;
      A391fcxvCITY = "" ;
      A392fcxvSTATE = "" ;
      A393fcxvZIPCODE = "" ;
      A412fcxvCENTRO = "" ;
      A409fcxvTPOCODID = "" ;
      A406fcxvCUIT = "" ;
      A414fcxvDISTRIBUTIONCHANNEL = "" ;
      A435fcxvAUTALC = "" ;
      A396fcxvVDRNOM = "" ;
      A397fcxvVDREMA = "" ;
      A398fcxvVDRTEL = "" ;
      A411fcxvLISTID = "" ;
      A1200fcxvDRPMIN = DecimalUtil.ZERO ;
      AV10AccountItem = new com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem(remoteHandle, context);
      AV9accou = new GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem>(com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem.class, "AccountRequestItem", "B2BRestV1", remoteHandle);
      AV44now = GXutil.resetTime( GXutil.nullDate() );
      AV45mensaje = "" ;
      AV52ids = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58Pgmname = "" ;
      AV48Api = "" ;
      AV24licfec = "" ;
      Gx_date = GXutil.nullDate() ;
      GXt_char1 = "" ;
      GXv_int4 = new long[1] ;
      AV54tokenRecibido = "" ;
      GXv_char2 = new String[1] ;
      AV35message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_SdtMessages_Message5 = new com.genexus.SdtMessages_Message[1] ;
      GXv_boolean6 = new boolean[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.accounts.asndupdatedaccounts__default(),
         new Object[] {
             new Object[] {
            P00422_A268fcxvISDELETED, P00422_n268fcxvISDELETED, P00422_A267fcxvSQLID, P00422_A269fcxvCLIID, P00422_n269fcxvCLIID, P00422_A387fcxvCLINOM, P00422_A390fcxvDIR, P00422_A391fcxvCITY, P00422_A392fcxvSTATE, P00422_A393fcxvZIPCODE,
            P00422_A412fcxvCENTRO, P00422_A409fcxvTPOCODID, P00422_A406fcxvCUIT, P00422_A405fcxvDIVISION, P00422_A1183fcxvREGID, P00422_A394fcxvTERRITORIO, P00422_A414fcxvDISTRIBUTIONCHANNEL, P00422_A435fcxvAUTALC, P00422_A396fcxvVDRNOM, P00422_A397fcxvVDREMA,
            P00422_A398fcxvVDRTEL, P00422_A411fcxvLISTID, P00422_A1200fcxvDRPMIN
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV58Pgmname = "Accounts.AsndUpdatedAccounts" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV58Pgmname = "Accounts.AsndUpdatedAccounts" ;
      Gx_err = (short)(0) ;
   }

   private short A405fcxvDIVISION ;
   private short Gx_err ;
   private int AV16cuantos ;
   private int A269fcxvCLIID ;
   private int A1183fcxvREGID ;
   private int A394fcxvTERRITORIO ;
   private int AV37nro ;
   private int AV12CLIID ;
   private long AV46SQLID ;
   private long A267fcxvSQLID ;
   private long AV49b2blUltimoSQLID ;
   private long GXt_int3 ;
   private long GXv_int4[] ;
   private java.math.BigDecimal A1200fcxvDRPMIN ;
   private String AV19env ;
   private String scmdbuf ;
   private String A268fcxvISDELETED ;
   private String A387fcxvCLINOM ;
   private String A391fcxvCITY ;
   private String A392fcxvSTATE ;
   private String A393fcxvZIPCODE ;
   private String A412fcxvCENTRO ;
   private String A409fcxvTPOCODID ;
   private String A406fcxvCUIT ;
   private String A435fcxvAUTALC ;
   private String A396fcxvVDRNOM ;
   private String A398fcxvVDRTEL ;
   private String A411fcxvLISTID ;
   private String AV58Pgmname ;
   private String AV48Api ;
   private String AV24licfec ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV44now ;
   private java.util.Date Gx_date ;
   private boolean AV18debug ;
   private boolean AV50MuestraUltimoSQLID ;
   private boolean returnInSub ;
   private boolean n268fcxvISDELETED ;
   private boolean n269fcxvCLIID ;
   private boolean AV41success ;
   private boolean GXv_boolean6[] ;
   private String AV54tokenRecibido ;
   private String AV15country ;
   private String A390fcxvDIR ;
   private String A414fcxvDISTRIBUTIONCHANNEL ;
   private String A397fcxvVDREMA ;
   private String AV45mensaje ;
   private IDataStoreProvider pr_default ;
   private String[] P00422_A268fcxvISDELETED ;
   private boolean[] P00422_n268fcxvISDELETED ;
   private long[] P00422_A267fcxvSQLID ;
   private int[] P00422_A269fcxvCLIID ;
   private boolean[] P00422_n269fcxvCLIID ;
   private String[] P00422_A387fcxvCLINOM ;
   private String[] P00422_A390fcxvDIR ;
   private String[] P00422_A391fcxvCITY ;
   private String[] P00422_A392fcxvSTATE ;
   private String[] P00422_A393fcxvZIPCODE ;
   private String[] P00422_A412fcxvCENTRO ;
   private String[] P00422_A409fcxvTPOCODID ;
   private String[] P00422_A406fcxvCUIT ;
   private short[] P00422_A405fcxvDIVISION ;
   private int[] P00422_A1183fcxvREGID ;
   private int[] P00422_A394fcxvTERRITORIO ;
   private String[] P00422_A414fcxvDISTRIBUTIONCHANNEL ;
   private String[] P00422_A435fcxvAUTALC ;
   private String[] P00422_A396fcxvVDRNOM ;
   private String[] P00422_A397fcxvVDREMA ;
   private String[] P00422_A398fcxvVDRTEL ;
   private String[] P00422_A411fcxvLISTID ;
   private java.math.BigDecimal[] P00422_A1200fcxvDRPMIN ;
   private GXSimpleCollection<String> AV52ids ;
   private GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem> AV9accou ;
   private com.genexus.SdtMessages_Message AV35message ;
   private com.genexus.SdtMessages_Message GXv_SdtMessages_Message5[] ;
   private com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem AV10AccountItem ;
}

final  class asndupdatedaccounts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00422", "SELECT T1.ISDELETED, T1.SQLID, T1.CLIID AS fcxvCLIID, T1.CLINOM, T1.DIR, T1.CITY, T1.STATE, T1.ZIPCODE, T1.CENTRO, T1.TPOCODID, T1.CUIT, T1.DIVISION, T1.REGID, T1.TERRITORIO, T1.DISTRIBUTIONCHANNEL, T2.AUTALC AS fcxvAUTALC, T1.VDRNOM, T1.VDREMA, T1.VDRTEL, T1.LISTID, T1.DRPMIN FROM (FCLIXVDRSEQ T1 LEFT JOIN Reba T2 ON T2.CLIID = T1.CLIID) WHERE (T1.SQLID > ?) AND (T1.ISDELETED = 'FALSE') ORDER BY T1.SQLID  FOR FETCH ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 45);
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 15);
               ((String[]) buf[8])[0] = rslt.getString(7, 15);
               ((String[]) buf[9])[0] = rslt.getString(8, 10);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((String[]) buf[11])[0] = rslt.getString(10, 15);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getVarchar(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((String[]) buf[19])[0] = rslt.getVarchar(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 45);
               ((String[]) buf[21])[0] = rslt.getString(20, 10);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

