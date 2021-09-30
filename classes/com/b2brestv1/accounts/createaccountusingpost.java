/*
               File: CreateAccountUsingPOST
        Description: Account creation
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:41.79
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class createaccountusingpost extends GXProcedure
{
   public createaccountusingpost( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( createaccountusingpost.class ), "" );
   }

   public createaccountusingpost( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public boolean executeUdp( String aP0 ,
                              String aP1 ,
                              String aP2 ,
                              long aP3 ,
                              GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem> aP4 ,
                              String aP5 ,
                              String aP6 ,
                              String aP7 ,
                              com.genexus.SdtMessages_Message[] aP8 )
   {
      createaccountusingpost.this.AV23env = aP0;
      createaccountusingpost.this.AV8Authorization = aP1;
      createaccountusingpost.this.AV25Api = aP2;
      createaccountusingpost.this.AV27b2blUltimoSQLID = aP3;
      createaccountusingpost.this.AV9accounts = aP4;
      createaccountusingpost.this.AV10country = aP5;
      createaccountusingpost.this.AV11Content_Encoding = aP6;
      createaccountusingpost.this.AV12requestTraceId = aP7;
      createaccountusingpost.this.aP8 = aP8;
      createaccountusingpost.this.aP9 = aP9;
      createaccountusingpost.this.aP9 = new boolean[] {false};
      initialize();
      privateExecute();
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        long aP3 ,
                        GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem> aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        com.genexus.SdtMessages_Message[] aP8 ,
                        boolean[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             long aP3 ,
                             GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem> aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             com.genexus.SdtMessages_Message[] aP8 ,
                             boolean[] aP9 )
   {
      createaccountusingpost.this.AV23env = aP0;
      createaccountusingpost.this.AV8Authorization = aP1;
      createaccountusingpost.this.AV25Api = aP2;
      createaccountusingpost.this.AV27b2blUltimoSQLID = aP3;
      createaccountusingpost.this.AV9accounts = aP4;
      createaccountusingpost.this.AV10country = aP5;
      createaccountusingpost.this.AV11Content_Encoding = aP6;
      createaccountusingpost.this.AV12requestTraceId = aP7;
      createaccountusingpost.this.aP8 = aP8;
      createaccountusingpost.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13localVarPath = "/" ;
      AV20localVarHeaders.set("country", GXutil.trim( AV10country));
      AV20localVarHeaders.set("authorization", GXutil.trim( AV8Authorization));
      AV24accountsAUX.fromJSonString(GXutil.strReplace( AV9accounts.toJSonString(false), "\"liquorLicense\": [],", ""), null);
      GXt_SdtApiResponse1 = AV16localVarResponse;
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new com.b2brestv1.accounts.apibaseurl(remoteHandle, context).execute( AV23env, GXv_char3) ;
      createaccountusingpost.this.GXt_char2 = GXv_char3[0] ;
      GXv_SdtApiResponse4[0] = GXt_SdtApiResponse1;
      new com.b2brestv1.openapicommon.callapi(remoteHandle, context).execute( "POST", GXt_char2+AV13localVarPath, AV25Api, AV27b2blUltimoSQLID, AV20localVarHeaders, AV14localVarPathParams, AV15localVarQueryParams, AV19localFileFormParams, AV9accounts.toJSonString(false), "", (short)(0), (short)(0), GXv_SdtApiResponse4) ;
      GXt_SdtApiResponse1 = GXv_SdtApiResponse4[0] ;
      AV16localVarResponse = GXt_SdtApiResponse1;
      AV17localVarStatusCode = (short)(AV16localVarResponse.getgxTv_SdtApiResponse_Statuscode()) ;
      if ( ( AV17localVarStatusCode == 202 ) || ( AV17localVarStatusCode == 200 ) )
      {
         AV22message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV17localVarStatusCode, 4, 0) );
         AV22message.setgxTv_SdtMessages_Message_Description( "Accepted" );
         AV21success = true ;
      }
      else
      {
         AV21success = false ;
         AV22message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = createaccountusingpost.this.AV22message;
      this.aP9[0] = createaccountusingpost.this.AV21success;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV13localVarPath = "" ;
      AV20localVarHeaders = new com.genexus.util.GXProperties();
      AV24accountsAUX = new GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem>(com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem.class, "AccountRequestItem", "B2BRestV1", remoteHandle);
      AV16localVarResponse = new com.b2brestv1.openapicommon.SdtApiResponse(remoteHandle, context);
      GXt_SdtApiResponse1 = new com.b2brestv1.openapicommon.SdtApiResponse(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV14localVarPathParams = new com.genexus.util.GXProperties();
      AV15localVarQueryParams = new com.genexus.util.GXProperties();
      AV19localFileFormParams = new GXSimpleCollection<com.genexus.util.GXFile>();
      GXv_SdtApiResponse4 = new com.b2brestv1.openapicommon.SdtApiResponse[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17localVarStatusCode ;
   private short Gx_err ;
   private long AV27b2blUltimoSQLID ;
   private String AV23env ;
   private String AV25Api ;
   private String AV13localVarPath ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean AV21success ;
   private String AV8Authorization ;
   private String AV10country ;
   private String AV11Content_Encoding ;
   private String AV12requestTraceId ;
   private com.genexus.SdtMessages_Message[] aP8 ;
   private boolean[] aP9 ;
   private com.genexus.util.GXProperties AV20localVarHeaders ;
   private com.genexus.util.GXProperties AV14localVarPathParams ;
   private com.genexus.util.GXProperties AV15localVarQueryParams ;
   private GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem> AV9accounts ;
   private GXBaseCollection<com.b2brestv1.accounts.SdtAccountRequest_AccountRequestItem> AV24accountsAUX ;
   private GXSimpleCollection<com.genexus.util.GXFile> AV19localFileFormParams ;
   private com.genexus.SdtMessages_Message AV22message ;
   private com.b2brestv1.openapicommon.SdtApiResponse AV16localVarResponse ;
   private com.b2brestv1.openapicommon.SdtApiResponse GXt_SdtApiResponse1 ;
   private com.b2brestv1.openapicommon.SdtApiResponse GXv_SdtApiResponse4[] ;
}

