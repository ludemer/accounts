/*
               File: accounts.StructSdtSalesRepresentative
        Description: SalesRepresentative
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:25.65
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtSalesRepresentative implements Cloneable, java.io.Serializable
{
   public StructSdtSalesRepresentative( )
   {
      gxTv_SdtSalesRepresentative_Email = "" ;
      gxTv_SdtSalesRepresentative_Name = "" ;
      gxTv_SdtSalesRepresentative_Phone = "" ;
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

   public String getEmail( )
   {
      return gxTv_SdtSalesRepresentative_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtSalesRepresentative_Email = value ;
   }

   public String getName( )
   {
      return gxTv_SdtSalesRepresentative_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtSalesRepresentative_Name = value ;
   }

   public String getPhone( )
   {
      return gxTv_SdtSalesRepresentative_Phone ;
   }

   public void setPhone( String value )
   {
      gxTv_SdtSalesRepresentative_Phone = value ;
   }

   protected String gxTv_SdtSalesRepresentative_Email ;
   protected String gxTv_SdtSalesRepresentative_Name ;
   protected String gxTv_SdtSalesRepresentative_Phone ;
}

