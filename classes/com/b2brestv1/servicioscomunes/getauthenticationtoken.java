/*
               File: GetAuthenticationToken
        Description: GetAuthenticationToken
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.28
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getauthenticationtoken extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.b2brestv1.GXcfg.class);
      getauthenticationtoken pgm = new getauthenticationtoken (-1);
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

   public getauthenticationtoken( )
   {
      super( -1 , new ModelContext( getauthenticationtoken.class ), "" );
      Application.init(com.b2brestv1.GXcfg.class);
   }

   public getauthenticationtoken( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getauthenticationtoken.class ), "" );
   }

   public getauthenticationtoken( int remoteHandle ,
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
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new com.b2brestv1.servicioscomunes.agetauthenticationtoken(remoteHandle, context).execute( aP0, aP1 );
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

