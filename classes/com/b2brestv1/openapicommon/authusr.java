/*
               File: authusr
        Description: authusr
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.22
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.openapicommon ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class authusr extends GXProcedure
{
   public authusr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( authusr.class ), "" );
   }

   public authusr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      authusr.this.AV9env = aP0;
      authusr.this.AV10country = aP1;
      authusr.this.aP2 = aP2;
      authusr.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      authusr.this.AV9env = aP0;
      authusr.this.AV10country = aP1;
      authusr.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV22DynamicToken ;
      GXv_char2[0] = GXt_char1 ;
      new com.b2brestv1.servicioscomunes.sysprops(remoteHandle, context).execute( "DynamicToken", GXv_char2) ;
      authusr.this.GXt_char1 = GXv_char2[0] ;
      AV22DynamicToken = GXutil.trim( GXt_char1) ;
      if ( GXutil.strcmp(AV22DynamicToken, "YES") == 0 )
      {
         /* Using cursor P00212 */
         pr_localmysql.execute(0, new Object[] {AV10country, AV9env});
         while ( (pr_localmysql.getStatus(0) != 101) )
         {
            brk212 = false ;
            A1225TokenEnv = P00212_A1225TokenEnv[0] ;
            n1225TokenEnv = P00212_n1225TokenEnv[0] ;
            A1217TokenPais = P00212_A1217TokenPais[0] ;
            n1217TokenPais = P00212_n1217TokenPais[0] ;
            A1219TokenRecibido = P00212_A1219TokenRecibido[0] ;
            n1219TokenRecibido = P00212_n1219TokenRecibido[0] ;
            A1220TokenTipo = P00212_A1220TokenTipo[0] ;
            n1220TokenTipo = P00212_n1220TokenTipo[0] ;
            A1216TokenId = P00212_A1216TokenId[0] ;
            A1218TokenFecha = P00212_A1218TokenFecha[0] ;
            n1218TokenFecha = P00212_n1218TokenFecha[0] ;
            AV16FechaEjecucion = localUtil.ctot( A1218TokenFecha, 2) ;
            AV18Vigencia = GXutil.dtadd( AV16FechaEjecucion, 60*(49)) ;
            AV17Ahora = GXutil.now( ) ;
            if ( AV17Ahora.after( AV18Vigencia ) )
            {
               new com.b2brestv1.servicioscomunes.getauthenticationtoken(remoteHandle, context).execute( AV10country, AV9env) ;
               while ( (pr_localmysql.getStatus(0) != 101) && ( P00212_A1216TokenId[0] == A1216TokenId ) )
               {
                  brk212 = false ;
                  A1225TokenEnv = P00212_A1225TokenEnv[0] ;
                  n1225TokenEnv = P00212_n1225TokenEnv[0] ;
                  A1217TokenPais = P00212_A1217TokenPais[0] ;
                  n1217TokenPais = P00212_n1217TokenPais[0] ;
                  A1219TokenRecibido = P00212_A1219TokenRecibido[0] ;
                  n1219TokenRecibido = P00212_n1219TokenRecibido[0] ;
                  A1220TokenTipo = P00212_A1220TokenTipo[0] ;
                  n1220TokenTipo = P00212_n1220TokenTipo[0] ;
                  if ( GXutil.strcmp(A1217TokenPais, AV10country) == 0 )
                  {
                     if ( GXutil.strcmp(A1225TokenEnv, AV9env) == 0 )
                     {
                        AV8auth = GXutil.trim( A1220TokenTipo) + " " + GXutil.trim( A1219TokenRecibido) ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
                  brk212 = true ;
                  pr_localmysql.readNext(0);
               }
            }
            else
            {
               AV8auth = GXutil.trim( A1220TokenTipo) + " " + GXutil.trim( A1219TokenRecibido) ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            if ( ! brk212 )
            {
               brk212 = true ;
               pr_localmysql.readNext(0);
            }
         }
         pr_localmysql.close(0);
      }
      else
      {
         if ( GXutil.strcmp(AV9env, "prd") == 0 )
         {
            AV8auth = "Basic YWRhcHRlci1yZWxheS11c2VyOitNYlFlVGhXbVpxNHQ3dyF6JUMqRi1KYU5jUmZValhu" ;
         }
         else
         {
            AV8auth = "Basic cm9vdDpyb290" ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = authusr.this.AV8auth;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8auth = "" ;
      AV22DynamicToken = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P00212_A1225TokenEnv = new String[] {""} ;
      P00212_n1225TokenEnv = new boolean[] {false} ;
      P00212_A1217TokenPais = new String[] {""} ;
      P00212_n1217TokenPais = new boolean[] {false} ;
      P00212_A1219TokenRecibido = new String[] {""} ;
      P00212_n1219TokenRecibido = new boolean[] {false} ;
      P00212_A1220TokenTipo = new String[] {""} ;
      P00212_n1220TokenTipo = new boolean[] {false} ;
      P00212_A1216TokenId = new long[1] ;
      P00212_A1218TokenFecha = new String[] {""} ;
      P00212_n1218TokenFecha = new boolean[] {false} ;
      A1225TokenEnv = "" ;
      A1217TokenPais = "" ;
      A1219TokenRecibido = "" ;
      A1220TokenTipo = "" ;
      A1218TokenFecha = "" ;
      AV16FechaEjecucion = GXutil.resetTime( GXutil.nullDate() );
      AV18Vigencia = GXutil.resetTime( GXutil.nullDate() );
      AV17Ahora = GXutil.resetTime( GXutil.nullDate() );
      pr_localmysql = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.openapicommon.authusr__localmysql(),
         new Object[] {
             new Object[] {
            P00212_A1225TokenEnv, P00212_n1225TokenEnv, P00212_A1217TokenPais, P00212_n1217TokenPais, P00212_A1219TokenRecibido, P00212_n1219TokenRecibido, P00212_A1220TokenTipo, P00212_n1220TokenTipo, P00212_A1216TokenId, P00212_A1218TokenFecha,
            P00212_n1218TokenFecha
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A1216TokenId ;
   private String AV9env ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A1225TokenEnv ;
   private String A1217TokenPais ;
   private String A1218TokenFecha ;
   private java.util.Date AV16FechaEjecucion ;
   private java.util.Date AV18Vigencia ;
   private java.util.Date AV17Ahora ;
   private boolean brk212 ;
   private boolean n1225TokenEnv ;
   private boolean n1217TokenPais ;
   private boolean n1219TokenRecibido ;
   private boolean n1220TokenTipo ;
   private boolean n1218TokenFecha ;
   private String AV8auth ;
   private String A1219TokenRecibido ;
   private String AV10country ;
   private String AV22DynamicToken ;
   private String A1220TokenTipo ;
   private String[] aP2 ;
   private IDataStoreProvider pr_localmysql ;
   private String[] P00212_A1225TokenEnv ;
   private boolean[] P00212_n1225TokenEnv ;
   private String[] P00212_A1217TokenPais ;
   private boolean[] P00212_n1217TokenPais ;
   private String[] P00212_A1219TokenRecibido ;
   private boolean[] P00212_n1219TokenRecibido ;
   private String[] P00212_A1220TokenTipo ;
   private boolean[] P00212_n1220TokenTipo ;
   private long[] P00212_A1216TokenId ;
   private String[] P00212_A1218TokenFecha ;
   private boolean[] P00212_n1218TokenFecha ;
}

final  class authusr__localmysql extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00212", "SELECT `TokenEnv`, `TokenPais`, `TokenRecibido`, `TokenTipo`, `TokenId`, `TokenFecha` FROM `token` WHERE (`TokenPais` = ?) AND (`TokenEnv` = ?) ORDER BY `TokenId` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getLongVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 50);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "LOCALMYSQL";
   }

}

