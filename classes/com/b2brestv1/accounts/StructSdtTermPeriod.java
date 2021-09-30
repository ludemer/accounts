/*
               File: accounts.StructSdtTermPeriod
        Description: TermPeriod
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.56
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtTermPeriod implements Cloneable, java.io.Serializable
{
   public StructSdtTermPeriod( )
   {
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public int getDays( )
   {
      return gxTv_SdtTermPeriod_Days ;
   }

   public void setDays( int value )
   {
      gxTv_SdtTermPeriod_Days = value ;
   }

   protected int gxTv_SdtTermPeriod_Days ;
}

