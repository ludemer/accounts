/*
               File: toepoch
        Description: toepoch
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:44.68
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1 ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class toepoch extends GXProcedure
{
   public toepoch( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( toepoch.class ), "" );
   }

   public toepoch( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      toepoch.this.AV10epoch1 = aP0[0];
      this.aP0 = aP0;
      toepoch.this.aP0 = new long[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( long[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long[] aP0 )
   {
      toepoch.this.AV10epoch1 = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9fechahora = GXutil.now( ) ;
      /* User Code */
       long AV8epoch = AV9fechahora.getTime();
      AV10epoch1 = AV8epoch ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = toepoch.this.AV10epoch1;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9fechahora = GXutil.resetTime( GXutil.nullDate() );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV10epoch1 ;
   private long AV8epoch ;
   private java.util.Date AV9fechahora ;
   private long[] aP0 ;
}

