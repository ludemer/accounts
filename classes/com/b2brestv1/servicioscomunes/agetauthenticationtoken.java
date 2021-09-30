/*
               File: GetAuthenticationToken
        Description: Get Authentication Token
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.33
       Program type: Main program
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class agetauthenticationtoken extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.b2brestv1.GXcfg.class);
      agetauthenticationtoken pgm = new agetauthenticationtoken (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public agetauthenticationtoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( agetauthenticationtoken.class ), "" );
   }

   public agetauthenticationtoken( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String aP1 )
   {
      agetauthenticationtoken.this.AV11Country = aP0;
      agetauthenticationtoken.this.AV21env = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22prop = "URL_" + GXutil.trim( GXutil.upper( AV21env)) + "_TOKEN" ;
      GXv_char1[0] = AV24val ;
      new com.b2brestv1.servicioscomunes.getapiurl(remoteHandle, context).execute( AV22prop, GXv_char1) ;
      agetauthenticationtoken.this.AV24val = GXv_char1[0] ;
      AV23url = AV24val ;
      AV22prop = "CLIENT_ID_" + GXutil.trim( GXutil.upper( AV21env)) ;
      GXv_char1[0] = AV24val ;
      new com.b2brestv1.servicioscomunes.getapiurl(remoteHandle, context).execute( AV22prop, GXv_char1) ;
      agetauthenticationtoken.this.AV24val = GXv_char1[0] ;
      AV18clien = AV24val ;
      AV22prop = "CLIENT_SECRET_" + GXutil.trim( GXutil.upper( AV21env)) ;
      GXv_char1[0] = AV24val ;
      new com.b2brestv1.servicioscomunes.getapiurl(remoteHandle, context).execute( AV22prop, GXv_char1) ;
      agetauthenticationtoken.this.AV24val = GXv_char1[0] ;
      AV20clise = AV24val ;
      AV16reqid = java.util.UUID.randomUUID( ) ;
      AV17reqidc = GXutil.trim( AV16reqid.toString()) ;
      AV9HttpClient.setPort( 443 );
      AV9HttpClient.setSecure( (byte)(1) );
      AV9HttpClient.addHeader("Content-Type", "application/x-www-form-urlencoded");
      AV9HttpClient.addHeader("requestTraceId", GXutil.trim( AV17reqidc));
      AV9HttpClient.addVariable("grant_type", "client_credentials");
      AV9HttpClient.addVariable("client_id", GXutil.trim( AV18clien));
      AV9HttpClient.addVariable("scope", "openid");
      AV9HttpClient.addVariable("client_secret", GXutil.trim( AV20clise));
      System.out.println( "HttpA: "+AV9HttpClient.getString() );
      AV9HttpClient.execute("POST", GXutil.trim( AV23url));
      System.out.println( "HttpB: "+AV9HttpClient.getString() );
      if ( AV9HttpClient.getStatusCode() == 200 )
      {
         AV10SDTToken.fromJSonString(AV9HttpClient.getString(), null);
         /* Execute user subroutine: 'CREARTOKEN' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         System.out.println( "error de conexion al consumir WS - GetAuthenticationToken" );
         System.out.println( "StatusCode: "+GXutil.str( AV9HttpClient.getStatusCode(), 10, 2) );
         System.out.println( "ErrDescription: "+GXutil.trim( AV9HttpClient.getErrDescription()) );
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CREARTOKEN' Routine */
      returnInSub = false ;
      AV27GXLvl54 = (byte)(0) ;
      /* Using cursor P00952 */
      pr_localmysql.execute(0);
      while ( (pr_localmysql.getStatus(0) != 101) )
      {
         A1216TokenId = P00952_A1216TokenId[0] ;
         AV27GXLvl54 = (byte)(1) ;
         AV12TokenId = (long)(A1216TokenId+1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_localmysql.readNext(0);
      }
      pr_localmysql.close(0);
      if ( AV27GXLvl54 == 0 )
      {
         AV12TokenId = 1 ;
      }
      AV14DateTime = GXutil.now( ) ;
      /*
         INSERT RECORD ON TABLE TOKEN

      */
      A1216TokenId = AV12TokenId ;
      A1217TokenPais = AV11Country ;
      n1217TokenPais = false ;
      A1218TokenFecha = GXutil.trim( localUtil.ttoc( AV14DateTime, 8, 5, 1, 2, "/", ":", " ")) ;
      n1218TokenFecha = false ;
      A1220TokenTipo = GXutil.trim( AV10SDTToken.getgxTv_SdtSDTToken_Token_type()) ;
      n1220TokenTipo = false ;
      A1219TokenRecibido = GXutil.trim( AV10SDTToken.getgxTv_SdtSDTToken_Access_token()) ;
      n1219TokenRecibido = false ;
      A1225TokenEnv = GXutil.trim( AV21env) ;
      n1225TokenEnv = false ;
      /* Using cursor P00953 */
      pr_localmysql.execute(1, new Object[] {Long.valueOf(A1216TokenId), Boolean.valueOf(n1217TokenPais), A1217TokenPais, Boolean.valueOf(n1218TokenFecha), A1218TokenFecha, Boolean.valueOf(n1220TokenTipo), A1220TokenTipo, Boolean.valueOf(n1219TokenRecibido), A1219TokenRecibido, Boolean.valueOf(n1225TokenEnv), A1225TokenEnv});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("token");
      if ( (pr_localmysql.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(getauthenticationtoken.class);
      return new com.b2brestv1.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "servicioscomunes.agetauthenticationtoken");
      CloseOpenCursors();
      AV9HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22prop = "" ;
      AV24val = "" ;
      AV23url = "" ;
      AV18clien = "" ;
      GXv_char1 = new String[1] ;
      AV20clise = "" ;
      AV16reqid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV17reqidc = "" ;
      AV9HttpClient = new com.genexus.internet.HttpClient();
      AV10SDTToken = new com.b2brestv1.servicioscomunes.SdtSDTToken(remoteHandle, context);
      scmdbuf = "" ;
      P00952_A1216TokenId = new long[1] ;
      AV14DateTime = GXutil.resetTime( GXutil.nullDate() );
      A1217TokenPais = "" ;
      A1218TokenFecha = "" ;
      A1220TokenTipo = "" ;
      A1219TokenRecibido = "" ;
      A1225TokenEnv = "" ;
      Gx_emsg = "" ;
      pr_localmysql = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.servicioscomunes.agetauthenticationtoken__localmysql(),
         new Object[] {
             new Object[] {
            P00952_A1216TokenId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27GXLvl54 ;
   private short Gx_err ;
   private int GX_INS130 ;
   private long A1216TokenId ;
   private long AV12TokenId ;
   private String AV11Country ;
   private String AV21env ;
   private String AV22prop ;
   private String AV24val ;
   private String AV23url ;
   private String AV18clien ;
   private String GXv_char1[] ;
   private String AV20clise ;
   private String AV17reqidc ;
   private String scmdbuf ;
   private String A1217TokenPais ;
   private String A1218TokenFecha ;
   private String A1225TokenEnv ;
   private String Gx_emsg ;
   private java.util.Date AV14DateTime ;
   private boolean returnInSub ;
   private boolean n1217TokenPais ;
   private boolean n1218TokenFecha ;
   private boolean n1220TokenTipo ;
   private boolean n1219TokenRecibido ;
   private boolean n1225TokenEnv ;
   private String A1219TokenRecibido ;
   private String A1220TokenTipo ;
   private java.util.UUID AV16reqid ;
   private com.genexus.internet.HttpClient AV9HttpClient ;
   private IDataStoreProvider pr_localmysql ;
   private long[] P00952_A1216TokenId ;
   private IDataStoreProvider pr_default ;
   private com.b2brestv1.servicioscomunes.SdtSDTToken AV10SDTToken ;
}

final  class agetauthenticationtoken__localmysql extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00952", "SELECT `TokenId` FROM `token` ORDER BY `TokenId` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00953", "INSERT INTO `token`(`TokenId`, `TokenPais`, `TokenFecha`, `TokenTipo`, `TokenRecibido`, `TokenEnv`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 50);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 40);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(5, (String)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.CHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 3);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "LOCALMYSQL";
   }

}

