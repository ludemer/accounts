/*
               File: Chrnull
        Description: Chrnull
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:41.34
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class chrnull extends GXProcedure
{
   public chrnull( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( chrnull.class ), "" );
   }

   public chrnull( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      chrnull.this.aP0 = aP0;
      chrnull.this.aP0 = new String[] {""};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      chrnull.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Char = "null" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = chrnull.this.AV8Char;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Char = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Char ;
   private String[] aP0 ;
}

