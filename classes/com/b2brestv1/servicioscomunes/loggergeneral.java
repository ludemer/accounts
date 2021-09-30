/*
               File: LoggerGeneral
        Description: Logger General
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:44.48
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class loggergeneral extends GXProcedure
{
   public loggergeneral( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( loggergeneral.class ), "" );
   }

   public loggergeneral( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXSimpleCollection<String> aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXSimpleCollection<String> aP5 )
   {
      loggergeneral.this.AV22main = aP0;
      loggergeneral.this.AV11api = aP1;
      loggergeneral.this.AV13country = aP2;
      loggergeneral.this.AV14env = aP3;
      loggergeneral.this.AV10mensaje = aP4;
      loggergeneral.this.AV21ids = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( new com.b2brestv1.servicioscomunes.sysprops(remoteHandle, context).executeUdp( "ShowLoggerGeneralMsg"))), "ENABLED") == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_char1[0] = AV24pidc ;
         new com.b2brestv1.jvmid(remoteHandle, context).execute( GXv_char1) ;
         loggergeneral.this.AV24pidc = GXv_char1[0] ;
         AV25fraseID = "<ID= " + GXutil.trim( AV21ids.toJSonString(false)) ;
         if ( AV21ids.size() == 0 )
         {
            System.out.println( "["+GXutil.day( Gx_date)+"/"+GXutil.month( Gx_date)+"/"+GXutil.year( Gx_date)+" "+GXutil.time( )+"] ["+AV24pidc+"] ["+AV22main+"] ["+AV11api+"] ["+AV13country+"] ["+AV14env+"] "+GXutil.strReplace( GXutil.strReplace( AV25fraseID, "[", ""), "]", ">")+" <"+AV10mensaje+">" );
         }
         else
         {
            if ( GXutil.strcmp(AV10mensaje, "") == 0 )
            {
               System.out.println( "["+GXutil.day( Gx_date)+"/"+GXutil.month( Gx_date)+"/"+GXutil.year( Gx_date)+" "+GXutil.time( )+"] ["+AV24pidc+"] ["+AV22main+"] ["+AV11api+"] ["+AV13country+"] ["+AV14env+"] "+GXutil.strReplace( GXutil.strReplace( AV25fraseID, "[", ""), "]", ">")+" <>" );
            }
            else
            {
               System.out.println( "["+GXutil.day( Gx_date)+"/"+GXutil.month( Gx_date)+"/"+GXutil.year( Gx_date)+" "+GXutil.time( )+"] ["+AV24pidc+"] ["+AV22main+"] ["+AV11api+"] ["+AV13country+"] ["+AV14env+"] "+GXutil.strReplace( GXutil.strReplace( AV25fraseID, "[", ""), "]", ">")+" <"+AV10mensaje+">" );
            }
         }
      }
      cleanup();
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
      AV24pidc = "" ;
      GXv_char1 = new String[1] ;
      AV25fraseID = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13country ;
   private String AV14env ;
   private String AV24pidc ;
   private String GXv_char1[] ;
   private java.util.Date Gx_date ;
   private boolean Cond_result ;
   private String AV22main ;
   private String AV11api ;
   private String AV10mensaje ;
   private String AV25fraseID ;
   private GXSimpleCollection<String> AV21ids ;
}

