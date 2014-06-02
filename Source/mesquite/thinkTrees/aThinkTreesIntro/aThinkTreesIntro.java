package mesquite.thinkTrees.aThinkTreesIntro;

import mesquite.lib.duties.PackageIntro;

public class aThinkTreesIntro extends PackageIntro {

	/*.................................................................................................................*/
	public boolean startJob(String arguments, Object condition, boolean hiredByName) {
 		return true;
  	 }
  	 public Class getDutyClass(){
  	 	return aThinkTreesIntro.class;
  	 }
 	/*.................................................................................................................*/
	 public String getExplanation() {
	return "ThinkTrees is a package of Mesquite modules providing tools and exercises to encourage \"tree thinking\".";
	 }
   
	/*.................................................................................................................*/
    	 public String getName() {
		return "ThinkTrees Package";
   	 }
	/*.................................................................................................................*/
	/** Returns the name of the package of modules (e.g., "Basic Mesquite Package", "Rhetenor")*/
 	public String getPackageName(){
 		return "ThinkTrees Package";
 	}
	/*.................................................................................................................*/
	/** Returns citation for a package of modules*/
 	public String getPackageCitation(){
 		return "Maddison, D.R., & W.P. Maddison.  2012.  ThinkTrees.  A package of modules for Mesquite. Version 0.2.";
 	}
	/*.................................................................................................................*/
	/** Returns whether there is a splash banner*/
	public boolean hasSplash(){
 		return false; 
	}
}
