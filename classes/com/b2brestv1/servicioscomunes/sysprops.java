/*
               File: sysProps
        Description: sys Props
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:41.54
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class sysprops extends GXProcedure
{
   public sysprops( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sysprops.class ), "" );
   }

   public sysprops( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      sysprops.this.AV11prop = aP0;
      sysprops.this.aP1 = aP1;
      sysprops.this.aP1 = new String[] {""};
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
      sysprops.this.AV11prop = aP0;
      sysprops.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8file.setSource( "wkg.mdl.properties" );
      AV8file.open("");
      AV9Properties.fromJSonString(AV8file.readAllText(""), null);
      AV8file.close();
      AV10Property = (com.genexus.util.GXProperty)AV9Properties.first();
      while ( ! AV9Properties.eof() )
      {
         if ( GXutil.strcmp(GXutil.upper( AV10Property.getKey()), GXutil.upper( AV11prop)) == 0 )
         {
            AV12val = AV10Property.getValue() ;
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV10Property = (com.genexus.util.GXProperty)AV9Properties.next();
      }
      System.out.println( GXutil.trim( AV15Pgmname)+" -> Propiedad: {"+AV11prop+"} no encontrada." );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = sysprops.this.AV12val;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12val = "" ;
      AV8file = new com.genexus.util.GXFile();
      AV9Properties = new com.genexus.util.GXProperties();
      AV10Property = new com.genexus.util.GXProperty();
      AV15Pgmname = "" ;
      AV15Pgmname = "ServiciosComunes.sysProps" ;
      /* GeneXus formulas. */
      AV15Pgmname = "ServiciosComunes.sysProps" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV11prop ;
   private String AV12val ;
   private String AV15Pgmname ;
   private boolean returnInSub ;
   private com.genexus.util.GXFile AV8file ;
   private String[] aP1 ;
   private com.genexus.util.GXProperties AV9Properties ;
   private com.genexus.util.GXProperty AV10Property ;
}

