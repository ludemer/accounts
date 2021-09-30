/*
               File: jvmid
        Description: Stub for jvmid
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:44.71
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1 ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class jvmid extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.b2brestv1.GXcfg.class);
      jvmid pgm = new jvmid (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public jvmid( )
   {
      super( -1 , new ModelContext( jvmid.class ), "" );
      Application.init(com.b2brestv1.GXcfg.class);
   }

   public jvmid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( jvmid.class ), "" );
   }

   public jvmid( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      String[] aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new com.b2brestv1.ajvmid(remoteHandle, context).execute( aP0 );
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
}

