/*
               File: CallApi
        Description: Call API
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:44.80
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.openapicommon ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class callapi extends GXProcedure
{
   public callapi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( callapi.class ), "" );
   }

   public callapi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.b2brestv1.openapicommon.SdtApiResponse executeUdp( String aP0 ,
                                                                 String aP1 ,
                                                                 String aP2 ,
                                                                 long aP3 ,
                                                                 com.genexus.util.GXProperties aP4 ,
                                                                 com.genexus.util.GXProperties aP5 ,
                                                                 com.genexus.util.GXProperties aP6 ,
                                                                 GXSimpleCollection<com.genexus.util.GXFile> aP7 ,
                                                                 String aP8 ,
                                                                 String aP9 ,
                                                                 short aP10 ,
                                                                 short aP11 )
   {
      callapi.this.AV12Method = aP0;
      callapi.this.AV18Url = aP1;
      callapi.this.AV49Api = aP2;
      callapi.this.AV50b2blUltimoSQLID = aP3;
      callapi.this.AV26VarHeaders = aP4;
      callapi.this.AV20VarPathParams = aP5;
      callapi.this.AV22VarQueryParams = aP6;
      callapi.this.AV24FileFormParams = aP7;
      callapi.this.AV13PostData = aP8;
      callapi.this.AV11ContentType = aP9;
      callapi.this.AV17RetryCount = aP10;
      callapi.this.AV16RequestSecondsTimeout = aP11;
      callapi.this.aP12 = aP12;
      callapi.this.aP12 = new com.b2brestv1.openapicommon.SdtApiResponse[] {new com.b2brestv1.openapicommon.SdtApiResponse()};
      initialize();
      privateExecute();
      return aP12[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        long aP3 ,
                        com.genexus.util.GXProperties aP4 ,
                        com.genexus.util.GXProperties aP5 ,
                        com.genexus.util.GXProperties aP6 ,
                        GXSimpleCollection<com.genexus.util.GXFile> aP7 ,
                        String aP8 ,
                        String aP9 ,
                        short aP10 ,
                        short aP11 ,
                        com.b2brestv1.openapicommon.SdtApiResponse[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             long aP3 ,
                             com.genexus.util.GXProperties aP4 ,
                             com.genexus.util.GXProperties aP5 ,
                             com.genexus.util.GXProperties aP6 ,
                             GXSimpleCollection<com.genexus.util.GXFile> aP7 ,
                             String aP8 ,
                             String aP9 ,
                             short aP10 ,
                             short aP11 ,
                             com.b2brestv1.openapicommon.SdtApiResponse[] aP12 )
   {
      callapi.this.AV12Method = aP0;
      callapi.this.AV18Url = aP1;
      callapi.this.AV49Api = aP2;
      callapi.this.AV50b2blUltimoSQLID = aP3;
      callapi.this.AV26VarHeaders = aP4;
      callapi.this.AV20VarPathParams = aP5;
      callapi.this.AV22VarQueryParams = aP6;
      callapi.this.AV24FileFormParams = aP7;
      callapi.this.AV13PostData = aP8;
      callapi.this.AV11ContentType = aP9;
      callapi.this.AV17RetryCount = aP10;
      callapi.this.AV16RequestSecondsTimeout = aP11;
      callapi.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV37country ;
      GXv_char2[0] = GXt_char1 ;
      new com.b2brestv1.servicioscomunes.sysprops(remoteHandle, context).execute( "Pais", GXv_char2) ;
      callapi.this.GXt_char1 = GXv_char2[0] ;
      AV37country = GXutil.upper( GXutil.trim( GXt_char1)) ;
      if ( GXutil.strcmp(AV37country, "") == 0 )
      {
         AV37country = "PY" ;
      }
      AV48now = GXutil.now( ) ;
      AV51main = AV58Pgmname ;
      AV52env = "" ;
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV51main, AV49Api, AV37country, AV52env, "Inicio call api", new GXSimpleCollection<String>(String.class, "internal", "")) ;
      AV41tmpdatetime = GXutil.now( ) ;
      AV32reqid = java.util.UUID.randomUUID( ) ;
      AV39initTime = localUtil.ttoc( AV41tmpdatetime, 10, 8, 1, 2, "/", ":", " ") ;
      AV38reqidc = GXutil.trim( AV32reqid.toString()) ;
      AV30auth = false ;
      AV9httpClient.setSecure( (byte)(1) );
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new com.b2brestv1.servicioscomunes.sysprops(remoteHandle, context).execute( "RequestSecondsTimeout", GXv_char2) ;
      callapi.this.GXt_char1 = GXv_char2[0] ;
      AV59Requestsecondstimeout1 = CommonUtil.decimalVal( GXt_char1, ".") ;
      if ( AV16RequestSecondsTimeout == 0 )
      {
         AV59Requestsecondstimeout1 = DecimalUtil.doubleToDec(30) ;
      }
      else
      {
         AV59Requestsecondstimeout1 = DecimalUtil.doubleToDec(AV16RequestSecondsTimeout) ;
      }
      AV9httpClient.setTimeout( (short)(DecimalUtil.decToDouble(AV59Requestsecondstimeout1)) );
      AV26VarHeaders.remove("x-timestamp");
      AV26VarHeaders.remove("requestTraceId");
      AV26VarHeaders.remove("timezone");
      AV26VarHeaders.remove("Content-Encoding");
      AV26VarHeaders.remove("Content-Type");
      AV26VarHeaders.remove("charset");
      AV26VarHeaders.remove("country");
      GXv_int3[0] = AV34epo ;
      new com.b2brestv1.toepoch(remoteHandle, context).execute( GXv_int3) ;
      callapi.this.AV34epo = GXv_int3[0] ;
      AV26VarHeaders.set("x-timestamp", GXutil.trim( GXutil.str( AV34epo, 18, 0)));
      AV26VarHeaders.set("requestTraceId", AV38reqidc);
      GXt_char1 = AV55timezone ;
      GXv_char2[0] = GXt_char1 ;
      new com.b2brestv1.servicioscomunes.sysprops(remoteHandle, context).execute( "timezone", GXv_char2) ;
      callapi.this.GXt_char1 = GXv_char2[0] ;
      AV55timezone = GXutil.trim( GXt_char1) ;
      AV26VarHeaders.set("timezone", AV55timezone);
      AV26VarHeaders.set("Content-Type", "application/json; charset=UTF-8");
      AV26VarHeaders.set("charset", "utf-8");
      AV26VarHeaders.set("Accept", "application/json");
      AV26VarHeaders.set("country", AV37country);
      AV27VarHeader = (com.genexus.util.GXProperty)AV26VarHeaders.first();
      while ( ! AV26VarHeaders.eof() )
      {
         if ( AV36debug )
         {
            System.out.println( AV27VarHeader.getKey()+":"+AV27VarHeader.getValue() );
         }
         AV9httpClient.addHeader(AV27VarHeader.getKey(), AV27VarHeader.getValue());
         if ( GXutil.strcmp(GXutil.lower( AV27VarHeader.getKey()), "authorization") == 0 )
         {
            AV30auth = true ;
         }
         AV27VarHeader = (com.genexus.util.GXProperty)AV26VarHeaders.next();
      }
      if ( ! AV30auth )
      {
         AV9httpClient.addAuthentication((byte)(0), "", "relay", "relay");
      }
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV51main, AV49Api, AV37country, AV52env, "POST DATA : "+AV13PostData, new GXSimpleCollection<String>(String.class, "internal", "")) ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( new com.b2brestv1.servicioscomunes.sysprops(remoteHandle, context).executeUdp( "ShowCallApiPayload"))), "ENABLED") == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         System.out.println( AV13PostData );
      }
      if ( ! (GXutil.strcmp("", AV13PostData)==0) || ( GXutil.strcmp(GXutil.trim( AV49Api), "GetOrdersUsingGET") == 0 ) || ( GXutil.strcmp(GXutil.trim( AV49Api), "DeleteAccountUsingDELETE") == 0 ) || ( GXutil.strcmp(GXutil.trim( AV49Api), "DeleteInclusionUsingDELETE") == 0 ) )
      {
         GXt_char1 = AV35PostDataAUX ;
         GXv_char2[0] = AV13PostData ;
         GXv_char4[0] = GXt_char1 ;
         new com.b2brestv1.openapicommon.reemplazocaracteres(remoteHandle, context).execute( GXv_char2, GXv_char4) ;
         callapi.this.AV13PostData = GXv_char2[0] ;
         callapi.this.GXt_char1 = GXv_char4[0] ;
         AV35PostDataAUX = GXt_char1 ;
         AV9httpClient.addString(AV35PostDataAUX);
      }
      else
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( new com.b2brestv1.servicioscomunes.sysprops(remoteHandle, context).executeUdp( "ShowCallApiPayload"))), "ENABLED") == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         System.out.println( AV35PostDataAUX );
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV24FileFormParams.size() )
      {
         AV25File = (com.genexus.util.GXFile)AV24FileFormParams.elementAt(-1+AV60GXV1);
         AV9httpClient.addFile(AV25File.getAbsoluteName(), "");
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
      AV19UrlWithParms = AV18Url ;
      AV15RegularExpression = "(\\{(\\w+?)\\})" ;
      AV14RegExMatchCollection = GxRegex.Matches(AV19UrlWithParms,AV15RegularExpression) ;
      AV61GXV2 = 1 ;
      while ( AV61GXV2 <= AV14RegExMatchCollection.size() )
      {
         AV10RegExMatch = (GxRegexMatch)((GxRegexMatch)AV14RegExMatchCollection.elementAt(-1+AV61GXV2));
         AV21VarPathValue = AV20VarPathParams.get(AV10RegExMatch.getGroups().item(2)) ;
         AV19UrlWithParms = GXutil.strReplace( AV19UrlWithParms, AV10RegExMatch.getValue(), AV21VarPathValue) ;
         AV61GXV2 = (int)(AV61GXV2+1) ;
      }
      AV23VarQueryValue = (com.genexus.util.GXProperty)AV22VarQueryParams.first();
      while ( ! AV22VarQueryParams.eof() )
      {
         AV28QueryParams += GXutil.format( "%1=%2&", AV23VarQueryValue.getKey(), AV23VarQueryValue.getValue(), "", "", "", "", "", "", "") ;
         AV23VarQueryValue = (com.genexus.util.GXProperty)AV22VarQueryParams.next();
      }
      if ( ! (GXutil.strcmp("", AV28QueryParams)==0) )
      {
         AV19UrlWithParms += "?" + AV28QueryParams ;
      }
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV51main, AV49Api, AV37country, AV52env, "VarHeaders : "+GXutil.trim( AV26VarHeaders.toJSonString()), new GXSimpleCollection<String>(String.class, "internal", "")) ;
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV51main, AV49Api, AV37country, AV52env, "VarQueryParams : "+GXutil.trim( AV22VarQueryParams.toJSonString()), new GXSimpleCollection<String>(String.class, "internal", "")) ;
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV51main, AV49Api, AV37country, AV52env, "UrlWithParms : "+GXutil.trim( AV19UrlWithParms), new GXSimpleCollection<String>(String.class, "internal", "")) ;
      AV45estado = false ;
      if ( ( GXutil.strcmp(AV12Method, "DELETE") == 0 ) && ! (GXutil.strcmp("", AV13PostData)==0) )
      {
         AV53respuesta = AV54wkghhtpclient.wkghttpdelete(AV19UrlWithParms, AV26VarHeaders.toJSonString(), GXutil.strReplace( AV13PostData, "\"", "#")) ;
         if ( CommonUtil.decimalVal( AV53respuesta, ".").doubleValue() == 200 )
         {
            AV29ApiResponse.setgxTv_SdtApiResponse_Statuscode( 200 );
            AV29ApiResponse.setgxTv_SdtApiResponse_Errorcode( (short)(0) );
            AV29ApiResponse.setgxTv_SdtApiResponse_Errormessage( "" );
            AV29ApiResponse.setgxTv_SdtApiResponse_Content( "" );
         }
         else
         {
            AV29ApiResponse.setgxTv_SdtApiResponse_Statuscode( 500 );
            AV29ApiResponse.setgxTv_SdtApiResponse_Errorcode( (short)(500) );
            AV29ApiResponse.setgxTv_SdtApiResponse_Errormessage( GXutil.trim( AV53respuesta) );
            AV29ApiResponse.setgxTv_SdtApiResponse_Content( GXutil.trim( AV53respuesta) );
         }
      }
      else
      {
         AV9httpClient.execute(AV12Method, AV19UrlWithParms);
         AV29ApiResponse.setgxTv_SdtApiResponse_Content( AV9httpClient.getString() );
         AV29ApiResponse.setgxTv_SdtApiResponse_Statuscode( AV9httpClient.getStatusCode() );
         AV29ApiResponse.setgxTv_SdtApiResponse_Errorcode( AV9httpClient.getErrCode() );
         AV29ApiResponse.setgxTv_SdtApiResponse_Errormessage( AV9httpClient.getErrDescription() );
      }
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV51main, AV49Api, AV37country, AV52env, "Luego de invocar el servicio : "+GXutil.trim( AV29ApiResponse.toJSonString(false, true)), new GXSimpleCollection<String>(String.class, "internal", "")) ;
      AV41tmpdatetime = GXutil.now( ) ;
      AV40endTime = localUtil.ttoc( AV41tmpdatetime, 10, 8, 1, 2, "/", ":", " ") ;
      if ( ( AV29ApiResponse.getgxTv_SdtApiResponse_Statuscode() == 200 ) || ( AV29ApiResponse.getgxTv_SdtApiResponse_Statuscode() == 202 ) || ( AV29ApiResponse.getgxTv_SdtApiResponse_Statuscode() == 201 ) )
      {
         AV45estado = true ;
      }
      AV35PostDataAUX = AV26VarHeaders.toJSonString() + AV22VarQueryParams.toJSonString() + GXutil.trim( AV35PostDataAUX) + GXutil.trim( AV20VarPathParams.toJSonString()) ;
      GXv_int5[0] = (short)(AV29ApiResponse.getgxTv_SdtApiResponse_Statuscode()) ;
      GXv_int3[0] = AV50b2blUltimoSQLID ;
      GXv_char4[0] = AV49Api ;
      GXv_char2[0] = AV29ApiResponse.toxml(false, true, "ApiResponse", "B2BRestV1") ;
      GXv_char6[0] = AV35PostDataAUX ;
      GXv_char7[0] = AV38reqidc ;
      GXv_char8[0] = AV40endTime ;
      GXv_char9[0] = AV39initTime ;
      GXv_boolean10[0] = AV45estado ;
      GXv_char11[0] = AV12Method ;
      GXv_char12[0] = AV18Url ;
      GXv_char13[0] = AV37country ;
      new com.b2brestv1.servicioscomunes.grabab2blog(remoteHandle, context).execute( GXv_int5, GXv_int3, GXv_char4, GXv_char2, GXv_char6, GXv_char7, GXv_char8, GXv_char9, GXv_boolean10, GXv_char11, GXv_char12, GXv_char13) ;
      AV29ApiResponse.setgxTv_SdtApiResponse_Statuscode( GXv_int5[0] );
      callapi.this.AV50b2blUltimoSQLID = GXv_int3[0] ;
      callapi.this.AV49Api = GXv_char4[0] ;
      callapi.this.AV35PostDataAUX = GXv_char6[0] ;
      callapi.this.AV38reqidc = GXv_char7[0] ;
      callapi.this.AV40endTime = GXv_char8[0] ;
      callapi.this.AV39initTime = GXv_char9[0] ;
      callapi.this.AV45estado = GXv_boolean10[0] ;
      callapi.this.AV12Method = GXv_char11[0] ;
      callapi.this.AV18Url = GXv_char12[0] ;
      callapi.this.AV37country = GXv_char13[0] ;
      new com.b2brestv1.servicioscomunes.loggergeneral(remoteHandle, context).execute( AV51main, AV49Api, AV37country, AV52env, "B2BLog creada", new GXSimpleCollection<String>(String.class, "internal", "")) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = callapi.this.AV29ApiResponse;
      CloseOpenCursors();
      AV9httpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29ApiResponse = new com.b2brestv1.openapicommon.SdtApiResponse(remoteHandle, context);
      AV37country = "" ;
      AV48now = GXutil.resetTime( GXutil.nullDate() );
      AV51main = "" ;
      AV58Pgmname = "" ;
      AV52env = "" ;
      AV41tmpdatetime = GXutil.resetTime( GXutil.nullDate() );
      AV32reqid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV39initTime = "" ;
      AV38reqidc = "" ;
      AV9httpClient = new com.genexus.internet.HttpClient();
      AV59Requestsecondstimeout1 = DecimalUtil.ZERO ;
      AV55timezone = "" ;
      AV27VarHeader = new com.genexus.util.GXProperty();
      AV35PostDataAUX = "" ;
      GXt_char1 = "" ;
      AV25File = new com.genexus.util.GXFile();
      AV19UrlWithParms = "" ;
      AV15RegularExpression = "" ;
      AV14RegExMatchCollection = new com.genexus.GxUnknownObjectCollection();
      AV10RegExMatch = new GxRegexMatch();
      AV21VarPathValue = "" ;
      AV23VarQueryValue = new com.genexus.util.GXProperty();
      AV28QueryParams = "" ;
      AV53respuesta = "" ;
      AV54wkghhtpclient = new com.b2brestv1.servicioscomunes.Sdtwkghttpclient(remoteHandle, context);
      AV40endTime = "" ;
      GXv_int5 = new short[1] ;
      GXv_int3 = new long[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_boolean10 = new boolean[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      AV58Pgmname = "OpenAPICommon.CallApi" ;
      /* GeneXus formulas. */
      AV58Pgmname = "OpenAPICommon.CallApi" ;
      Gx_err = (short)(0) ;
   }

   private short AV17RetryCount ;
   private short AV16RequestSecondsTimeout ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV61GXV2 ;
   private long AV50b2blUltimoSQLID ;
   private long AV34epo ;
   private long GXv_int3[] ;
   private java.math.BigDecimal AV59Requestsecondstimeout1 ;
   private String AV12Method ;
   private String AV49Api ;
   private String AV11ContentType ;
   private String AV37country ;
   private String AV58Pgmname ;
   private String AV52env ;
   private String AV39initTime ;
   private String AV38reqidc ;
   private String AV55timezone ;
   private String GXt_char1 ;
   private String AV15RegularExpression ;
   private String AV21VarPathValue ;
   private String AV28QueryParams ;
   private String AV40endTime ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private java.util.Date AV48now ;
   private java.util.Date AV41tmpdatetime ;
   private boolean AV30auth ;
   private boolean AV36debug ;
   private boolean Cond_result ;
   private boolean returnInSub ;
   private boolean AV45estado ;
   private boolean GXv_boolean10[] ;
   private String AV18Url ;
   private String AV13PostData ;
   private String AV51main ;
   private String AV35PostDataAUX ;
   private String AV19UrlWithParms ;
   private String AV53respuesta ;
   private java.util.UUID AV32reqid ;
   private com.genexus.internet.HttpClient AV9httpClient ;
   private com.b2brestv1.servicioscomunes.Sdtwkghttpclient AV54wkghhtpclient ;
   private com.b2brestv1.openapicommon.SdtApiResponse[] aP12 ;
   private com.genexus.util.GXFile AV25File ;
   private com.genexus.util.GXProperties AV26VarHeaders ;
   private com.genexus.util.GXProperties AV20VarPathParams ;
   private com.genexus.util.GXProperties AV22VarQueryParams ;
   private com.genexus.util.GXProperty AV27VarHeader ;
   private com.genexus.util.GXProperty AV23VarQueryValue ;
   private GxRegexMatch AV10RegExMatch ;
   private com.genexus.GxUnknownObjectCollection AV14RegExMatchCollection ;
   private GXSimpleCollection<com.genexus.util.GXFile> AV24FileFormParams ;
   private com.b2brestv1.openapicommon.SdtApiResponse AV29ApiResponse ;
}

