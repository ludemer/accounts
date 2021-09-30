/*
               File: jvmid
        Description: jvmid
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:44.76
       Program type: Main program
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1 ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class ajvmid extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(com.b2brestv1.GXcfg.class);
      ajvmid pgm = new ajvmid (-1);
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

   public ajvmid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ajvmid.class ), "" );
   }

   public ajvmid( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      ajvmid.this.AV11pidC = aP0[0];
      this.aP0 = aP0;
      ajvmid.this.aP0 = new String[] {""};
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
      ajvmid.this.AV11pidC = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* User Code */
       java.lang.management.RuntimeMXBean bean = java.lang.management.ManagementFactory.getRuntimeMXBean();
      /* User Code */
       String AV10pid1 = bean.getName();
      AV11pidC = AV10pid1 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(jvmid.class);
      return new com.b2brestv1.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ajvmid.this.AV11pidC;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10pid1 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV11pidC ;
   private String AV10pid1 ;
   private String[] aP0 ;
}

