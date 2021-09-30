/*
               File: sndUpdatedAccounts
        Description: sndUpdatedAccounts
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.40
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class sndupdatedaccounts extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.b2brestv1.GXcfg.class);
      sndupdatedaccounts pgm = new sndupdatedaccounts (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      int aP2 = 0;
      boolean aP3 = false;
      boolean aP4 = false;

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (int) GXutil.lval( args[2]);
         aP3 = (boolean) GXutil.boolval( args[3]);
         aP4 = (boolean) GXutil.boolval( args[4]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public sndupdatedaccounts( )
   {
      super( -1 , new ModelContext( sndupdatedaccounts.class ), "" );
      Application.init(com.b2brestv1.GXcfg.class);
   }

   public sndupdatedaccounts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sndupdatedaccounts.class ), "" );
   }

   public sndupdatedaccounts( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        boolean aP3 ,
                        boolean aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             boolean aP3 ,
                             boolean aP4 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new com.b2brestv1.accounts.asndupdatedaccounts(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4 );
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

