/*
               File: GrabaB2BLog
        Description: Graba B2 BLog
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.83
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class grabab2blog extends GXProcedure
{
   public grabab2blog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( grabab2blog.class ), "" );
   }

   public grabab2blog( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             boolean[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      grabab2blog.this.AV21b2blhttpcode = aP0[0];
      this.aP0 = aP0;
      grabab2blog.this.AV14b2blUltimoSQLID = aP1[0];
      this.aP1 = aP1;
      grabab2blog.this.AV25b2blApi = aP2[0];
      this.aP2 = aP2;
      grabab2blog.this.AV15b2blmsgrec = aP3[0];
      this.aP3 = aP3;
      grabab2blog.this.AV10b2blmsgenv = aP4[0];
      this.aP4 = aP4;
      grabab2blog.this.AV9b2blguid = aP5[0];
      this.aP5 = aP5;
      grabab2blog.this.AV20b2blfecFin = aP6[0];
      this.aP6 = aP6;
      grabab2blog.this.AV19b2blfecini = aP7[0];
      this.aP7 = aP7;
      grabab2blog.this.AV13b2blRespOk = aP8[0];
      this.aP8 = aP8;
      grabab2blog.this.AV12b2blMethod = aP9[0];
      this.aP9 = aP9;
      grabab2blog.this.AV8b2blidsrv = aP10[0];
      this.aP10 = aP10;
      grabab2blog.this.AV24b2blpais = aP11[0];
      this.aP11 = aP11;
      grabab2blog.this.aP11 = new String[] {""};
      initialize();
      privateExecute();
      return aP11[0];
   }

   public void execute( short[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        boolean[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( short[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             boolean[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      grabab2blog.this.AV21b2blhttpcode = aP0[0];
      this.aP0 = aP0;
      grabab2blog.this.AV14b2blUltimoSQLID = aP1[0];
      this.aP1 = aP1;
      grabab2blog.this.AV25b2blApi = aP2[0];
      this.aP2 = aP2;
      grabab2blog.this.AV15b2blmsgrec = aP3[0];
      this.aP3 = aP3;
      grabab2blog.this.AV10b2blmsgenv = aP4[0];
      this.aP4 = aP4;
      grabab2blog.this.AV9b2blguid = aP5[0];
      this.aP5 = aP5;
      grabab2blog.this.AV20b2blfecFin = aP6[0];
      this.aP6 = aP6;
      grabab2blog.this.AV19b2blfecini = aP7[0];
      this.aP7 = aP7;
      grabab2blog.this.AV13b2blRespOk = aP8[0];
      this.aP8 = aP8;
      grabab2blog.this.AV12b2blMethod = aP9[0];
      this.aP9 = aP9;
      grabab2blog.this.AV8b2blidsrv = aP10[0];
      this.aP10 = aP10;
      grabab2blog.this.AV24b2blpais = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18now = GXutil.now( ) ;
      GXv_char1[0] = AV23pidc ;
      new com.b2brestv1.jvmid(remoteHandle, context).execute( GXv_char1) ;
      grabab2blog.this.AV23pidc = GXv_char1[0] ;
      /*
         INSERT RECORD ON TABLE B2BLOG

      */
      A213b2blidsrv = AV8b2blidsrv ;
      n213b2blidsrv = false ;
      A216b2blMethod = AV12b2blMethod ;
      n216b2blMethod = false ;
      A332b2blApi = GXutil.trim( AV25b2blApi) ;
      n332b2blApi = false ;
      A217b2blRespOk = AV13b2blRespOk ;
      n217b2blRespOk = false ;
      A220b2blFecIni = AV19b2blfecini ;
      n220b2blFecIni = false ;
      A221b2blfecFin = AV20b2blfecFin ;
      n221b2blfecFin = false ;
      A209b2blfec = GXutil.now( ) ;
      n209b2blfec = false ;
      A210b2blguid = AV9b2blguid ;
      n210b2blguid = false ;
      A211b2blmsgenv = AV10b2blmsgenv ;
      n211b2blmsgenv = false ;
      A218b2blmsgrec = AV15b2blmsgrec ;
      n218b2blmsgrec = false ;
      A219b2blUltimoSQLID = AV14b2blUltimoSQLID ;
      n219b2blUltimoSQLID = false ;
      A222b2blhttpcode = AV21b2blhttpcode ;
      n222b2blhttpcode = false ;
      A223b2blpidc = AV23pidc ;
      n223b2blpidc = false ;
      A224b2blpais = AV24b2blpais ;
      n224b2blpais = false ;
      /* Using cursor P003R2 */
      pr_localmysql.execute(0, new Object[] {Boolean.valueOf(n211b2blmsgenv), A211b2blmsgenv, Boolean.valueOf(n210b2blguid), A210b2blguid, Boolean.valueOf(n220b2blFecIni), A220b2blFecIni, Boolean.valueOf(n209b2blfec), A209b2blfec, Boolean.valueOf(n213b2blidsrv), A213b2blidsrv, Boolean.valueOf(n216b2blMethod), A216b2blMethod, Boolean.valueOf(n218b2blmsgrec), A218b2blmsgrec, Boolean.valueOf(n217b2blRespOk), Boolean.valueOf(A217b2blRespOk), Boolean.valueOf(n219b2blUltimoSQLID), Long.valueOf(A219b2blUltimoSQLID), Boolean.valueOf(n221b2blfecFin), A221b2blfecFin, Boolean.valueOf(n222b2blhttpcode), Short.valueOf(A222b2blhttpcode), Boolean.valueOf(n223b2blpidc), A223b2blpidc, Boolean.valueOf(n224b2blpais), A224b2blpais, Boolean.valueOf(n332b2blApi), A332b2blApi});
      /* Retrieving last key number assigned */
      /* Using cursor P003R3 */
      pr_localmysql.execute(1);
      A208b2blId = P003R3_A208b2blId[0] ;
      pr_localmysql.close(1);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("B2BLOG");
      if ( (pr_localmysql.getStatus(0) == 1) )
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
      Application.commitDataStores(context, remoteHandle, pr_default, "servicioscomunes.grabab2blog");
      System.out.println( AV23pidc+" "+GXutil.trim( GXutil.str( AV21b2blhttpcode, 4, 0))+" "+GXutil.trim( AV9b2blguid) );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = grabab2blog.this.AV21b2blhttpcode;
      this.aP1[0] = grabab2blog.this.AV14b2blUltimoSQLID;
      this.aP2[0] = grabab2blog.this.AV25b2blApi;
      this.aP3[0] = grabab2blog.this.AV15b2blmsgrec;
      this.aP4[0] = grabab2blog.this.AV10b2blmsgenv;
      this.aP5[0] = grabab2blog.this.AV9b2blguid;
      this.aP6[0] = grabab2blog.this.AV20b2blfecFin;
      this.aP7[0] = grabab2blog.this.AV19b2blfecini;
      this.aP8[0] = grabab2blog.this.AV13b2blRespOk;
      this.aP9[0] = grabab2blog.this.AV12b2blMethod;
      this.aP10[0] = grabab2blog.this.AV8b2blidsrv;
      this.aP11[0] = grabab2blog.this.AV24b2blpais;
      Application.commitDataStores(context, remoteHandle, pr_default, "servicioscomunes.grabab2blog");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18now = GXutil.resetTime( GXutil.nullDate() );
      AV23pidc = "" ;
      GXv_char1 = new String[1] ;
      A213b2blidsrv = "" ;
      A216b2blMethod = "" ;
      A332b2blApi = "" ;
      A220b2blFecIni = "" ;
      A221b2blfecFin = "" ;
      A209b2blfec = GXutil.resetTime( GXutil.nullDate() );
      A210b2blguid = "" ;
      A211b2blmsgenv = "" ;
      A218b2blmsgrec = "" ;
      A223b2blpidc = "" ;
      A224b2blpais = "" ;
      scmdbuf = "" ;
      P003R3_A208b2blId = new long[1] ;
      Gx_emsg = "" ;
      pr_localmysql = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.servicioscomunes.grabab2blog__localmysql(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P003R3_A208b2blId
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.servicioscomunes.grabab2blog__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV21b2blhttpcode ;
   private short A222b2blhttpcode ;
   private short Gx_err ;
   private int GX_INS40 ;
   private long AV14b2blUltimoSQLID ;
   private long A219b2blUltimoSQLID ;
   private long A208b2blId ;
   private String AV25b2blApi ;
   private String AV9b2blguid ;
   private String AV20b2blfecFin ;
   private String AV19b2blfecini ;
   private String AV12b2blMethod ;
   private String AV8b2blidsrv ;
   private String AV24b2blpais ;
   private String AV23pidc ;
   private String GXv_char1[] ;
   private String A213b2blidsrv ;
   private String A216b2blMethod ;
   private String A332b2blApi ;
   private String A220b2blFecIni ;
   private String A221b2blfecFin ;
   private String A210b2blguid ;
   private String A223b2blpidc ;
   private String A224b2blpais ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date AV18now ;
   private java.util.Date A209b2blfec ;
   private boolean AV13b2blRespOk ;
   private boolean n213b2blidsrv ;
   private boolean n216b2blMethod ;
   private boolean n332b2blApi ;
   private boolean A217b2blRespOk ;
   private boolean n217b2blRespOk ;
   private boolean n220b2blFecIni ;
   private boolean n221b2blfecFin ;
   private boolean n209b2blfec ;
   private boolean n210b2blguid ;
   private boolean n211b2blmsgenv ;
   private boolean n218b2blmsgrec ;
   private boolean n219b2blUltimoSQLID ;
   private boolean n222b2blhttpcode ;
   private boolean n223b2blpidc ;
   private boolean n224b2blpais ;
   private String AV15b2blmsgrec ;
   private String AV10b2blmsgenv ;
   private String A211b2blmsgenv ;
   private String A218b2blmsgrec ;
   private short[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private boolean[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_localmysql ;
   private long[] P003R3_A208b2blId ;
   private IDataStoreProvider pr_default ;
}

final  class grabab2blog__localmysql extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P003R2", "INSERT INTO `B2BLOG`(`b2blmsgenv`, `b2blguid`, `b2blfecini`, `b2blfec`, `b2blidsrv`, `b2blMethod`, `b2blmsgrec`, `b2blRespOk`, `b2blUltimoSQLID`, `b2blfecFin`, `b2blhttpcode`, `b2blpidc`, `b2blpais`, `b2blApi`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P003R3", "SELECT LAST_INSERT_ID() ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
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
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(1, (String)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 50);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 50);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.CHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 100);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.CHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 7);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(7, (String)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(8, ((Boolean) parms[15]).booleanValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[17]).longValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.CHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 50);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.CHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 40);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "LOCALMYSQL";
   }

}

final  class grabab2blog__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

