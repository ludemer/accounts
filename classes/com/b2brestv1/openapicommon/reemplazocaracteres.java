/*
               File: ReemplazoCaracteres
        Description: Reemplazo Caracteres
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:44.88
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.openapicommon ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class reemplazocaracteres extends GXProcedure
{
   public reemplazocaracteres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reemplazocaracteres.class ), "" );
   }

   public reemplazocaracteres( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 )
   {
      reemplazocaracteres.this.AV8PostData = aP0[0];
      this.aP0 = aP0;
      reemplazocaracteres.this.AV9PostDataAUX = aP1[0];
      this.aP1 = aP1;
      reemplazocaracteres.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      reemplazocaracteres.this.AV8PostData = aP0[0];
      this.aP0 = aP0;
      reemplazocaracteres.this.AV9PostDataAUX = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9PostDataAUX = GXutil.strReplace( AV8PostData, "\"NULL\"", "null") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "\"null\"", "null") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "\\\\n", "\\n") ;
      returnInSub = true;
      cleanup();
      if (true) return;
      AV9PostDataAUX = GXutil.strReplace( AV8PostData, "�", "N") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "D") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "n") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", " ") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "U") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "u") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "A") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "E") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "I") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "O") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "a") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "e") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "i") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "o") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "A") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "`", " ") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "e") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "a") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "i") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "o") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "u") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "y") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "i") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", " ") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "a") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "e") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "i") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "o") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "u") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "A") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "E") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "I") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "O") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "U") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "e") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "e") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "N") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "  ", " ") ;
      AV9PostDataAUX = GxRegex.Replace(AV9PostDataAUX,"\\x96","") ;
      AV9PostDataAUX = GxRegex.Replace(AV9PostDataAUX,"\\xc2","") ;
      AV9PostDataAUX = GxRegex.Replace(AV9PostDataAUX,"\\xa0","") ;
      AV9PostDataAUX = GxRegex.Replace(AV9PostDataAUX,"\\x82","") ;
      AV9PostDataAUX = GxRegex.Replace(AV9PostDataAUX,"\\x9a","") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "A") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "E") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "I") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "O") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "U") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GXutil.strReplace( AV9PostDataAUX, "�", "") ;
      AV9PostDataAUX = GxRegex.Replace(AV9PostDataAUX,"[^\\s:<>\",[{}a-zA-Z0-9_.@()]","") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = reemplazocaracteres.this.AV8PostData;
      this.aP1[0] = reemplazocaracteres.this.AV9PostDataAUX;
      CloseOpenCursors();
      exitApplication();
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
   private boolean returnInSub ;
   private String AV8PostData ;
   private String AV9PostDataAUX ;
   private String[] aP0 ;
   private String[] aP1 ;
}

