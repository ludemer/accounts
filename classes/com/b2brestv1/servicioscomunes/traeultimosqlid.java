/*
               File: TraeUltimoSQLID
        Description: Trae Ultimo SQLID
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.5
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class traeultimosqlid extends GXProcedure
{
   public traeultimosqlid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( traeultimosqlid.class ), "" );
   }

   public traeultimosqlid( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( String aP0 ,
                           String aP1 ,
                           String aP2 ,
                           String aP3 )
   {
      traeultimosqlid.this.AV8HTTPMethod = aP0;
      traeultimosqlid.this.AV9BaseURL = aP1;
      traeultimosqlid.this.AV11Api = aP2;
      traeultimosqlid.this.AV12b2blpais = aP3;
      traeultimosqlid.this.aP4 = aP4;
      traeultimosqlid.this.aP4 = new long[] {0};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             long[] aP4 )
   {
      traeultimosqlid.this.AV8HTTPMethod = aP0;
      traeultimosqlid.this.AV9BaseURL = aP1;
      traeultimosqlid.this.AV11Api = aP2;
      traeultimosqlid.this.AV12b2blpais = aP3;
      traeultimosqlid.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10SQLID = 0 ;
      /* Using cursor P00432 */
      pr_localmysql.execute(0, new Object[] {AV9BaseURL, AV8HTTPMethod, AV11Api, AV12b2blpais});
      while ( (pr_localmysql.getStatus(0) != 101) )
      {
         A213b2blidsrv = P00432_A213b2blidsrv[0] ;
         n213b2blidsrv = P00432_n213b2blidsrv[0] ;
         A216b2blMethod = P00432_A216b2blMethod[0] ;
         n216b2blMethod = P00432_n216b2blMethod[0] ;
         A332b2blApi = P00432_A332b2blApi[0] ;
         n332b2blApi = P00432_n332b2blApi[0] ;
         A224b2blpais = P00432_A224b2blpais[0] ;
         n224b2blpais = P00432_n224b2blpais[0] ;
         A217b2blRespOk = P00432_A217b2blRespOk[0] ;
         n217b2blRespOk = P00432_n217b2blRespOk[0] ;
         A219b2blUltimoSQLID = P00432_A219b2blUltimoSQLID[0] ;
         n219b2blUltimoSQLID = P00432_n219b2blUltimoSQLID[0] ;
         A208b2blId = P00432_A208b2blId[0] ;
         AV10SQLID = A219b2blUltimoSQLID ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_localmysql.readNext(0);
      }
      pr_localmysql.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = traeultimosqlid.this.AV10SQLID;
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
      P00432_A213b2blidsrv = new String[] {""} ;
      P00432_n213b2blidsrv = new boolean[] {false} ;
      P00432_A216b2blMethod = new String[] {""} ;
      P00432_n216b2blMethod = new boolean[] {false} ;
      P00432_A332b2blApi = new String[] {""} ;
      P00432_n332b2blApi = new boolean[] {false} ;
      P00432_A224b2blpais = new String[] {""} ;
      P00432_n224b2blpais = new boolean[] {false} ;
      P00432_A217b2blRespOk = new boolean[] {false} ;
      P00432_n217b2blRespOk = new boolean[] {false} ;
      P00432_A219b2blUltimoSQLID = new long[1] ;
      P00432_n219b2blUltimoSQLID = new boolean[] {false} ;
      P00432_A208b2blId = new long[1] ;
      A213b2blidsrv = "" ;
      A216b2blMethod = "" ;
      A332b2blApi = "" ;
      A224b2blpais = "" ;
      pr_localmysql = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.servicioscomunes.traeultimosqlid__localmysql(),
         new Object[] {
             new Object[] {
            P00432_A213b2blidsrv, P00432_n213b2blidsrv, P00432_A216b2blMethod, P00432_n216b2blMethod, P00432_A332b2blApi, P00432_n332b2blApi, P00432_A224b2blpais, P00432_n224b2blpais, P00432_A217b2blRespOk, P00432_n217b2blRespOk,
            P00432_A219b2blUltimoSQLID, P00432_n219b2blUltimoSQLID, P00432_A208b2blId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV10SQLID ;
   private long A219b2blUltimoSQLID ;
   private long A208b2blId ;
   private String AV8HTTPMethod ;
   private String AV11Api ;
   private String AV12b2blpais ;
   private String scmdbuf ;
   private String A213b2blidsrv ;
   private String A216b2blMethod ;
   private String A332b2blApi ;
   private String A224b2blpais ;
   private boolean n213b2blidsrv ;
   private boolean n216b2blMethod ;
   private boolean n332b2blApi ;
   private boolean n224b2blpais ;
   private boolean A217b2blRespOk ;
   private boolean n217b2blRespOk ;
   private boolean n219b2blUltimoSQLID ;
   private String AV9BaseURL ;
   private long[] aP4 ;
   private IDataStoreProvider pr_localmysql ;
   private String[] P00432_A213b2blidsrv ;
   private boolean[] P00432_n213b2blidsrv ;
   private String[] P00432_A216b2blMethod ;
   private boolean[] P00432_n216b2blMethod ;
   private String[] P00432_A332b2blApi ;
   private boolean[] P00432_n332b2blApi ;
   private String[] P00432_A224b2blpais ;
   private boolean[] P00432_n224b2blpais ;
   private boolean[] P00432_A217b2blRespOk ;
   private boolean[] P00432_n217b2blRespOk ;
   private long[] P00432_A219b2blUltimoSQLID ;
   private boolean[] P00432_n219b2blUltimoSQLID ;
   private long[] P00432_A208b2blId ;
}

final  class traeultimosqlid__localmysql extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00432", "SELECT `b2blidsrv`, `b2blMethod`, `b2blApi`, `b2blpais`, `b2blRespOk`, `b2blUltimoSQLID`, `b2blId` FROM `B2BLOG` WHERE (`b2blidsrv` = ? and `b2blMethod` = ?) AND (`b2blApi` = ?) AND (`b2blpais` = ?) AND (`b2blRespOk` = 1) ORDER BY `b2blidsrv`, `b2blMethod`, `b2blRespOk`, `b2blId` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 7);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((boolean[]) buf[8])[0] = rslt.getBoolean(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
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
               stmt.setVarchar(1, (String)parms[0], 1000);
               stmt.setString(2, (String)parms[1], 7);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 2);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "LOCALMYSQL";
   }

}

