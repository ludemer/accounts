/*
               File: ApiBaseUrl
        Description: APIBase Url
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:47.49
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class apibaseurl extends GXProcedure
{
   public apibaseurl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apibaseurl.class ), "" );
   }

   public apibaseurl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      apibaseurl.this.AV10env = aP0;
      apibaseurl.this.aP1 = aP1;
      apibaseurl.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      apibaseurl.this.AV10env = aP0;
      apibaseurl.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(GXutil.lower( AV10env), "uat") == 0 )
      {
         AV8BaseURL = "https://services-uat.bees-platform.dev/v1/account-relay/" ;
      }
      else if ( GXutil.strcmp(GXutil.lower( AV10env), "prd") == 0 )
      {
         AV8BaseURL = "https://services.bees-platform.com/api/account-relay/" ;
      }
      else if ( GXutil.strcmp(GXutil.lower( AV10env), "qa") == 0 )
      {
         AV8BaseURL = "https://services-sit.bees-platform.dev/v1/account-relay/" ;
      }
      else
      {
         AV8BaseURL = "http://127.0.0.1:8888/v1/account-relay/" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = apibaseurl.this.AV8BaseURL;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8BaseURL = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10env ;
   private String AV8BaseURL ;
   private String[] aP1 ;
}

