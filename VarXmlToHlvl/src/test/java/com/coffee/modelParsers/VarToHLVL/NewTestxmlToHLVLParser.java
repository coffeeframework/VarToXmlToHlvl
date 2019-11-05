package com.coffee.modelParsers.VarToHLVL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import static org.junit.Assert.fail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;
import com.coffee.modelParsers.varXmlToHLVLParser.VariamosXMLToHlvlParser;
import com.github.coffeeframework.utils.ParsingParameters;

public class NewTestxmlToHLVLParser {

	public static final String COMMON_PATH_INPUT ="temp/DataTestVariamos/xmlToHLVLFiles/";
	public static final String COMMON_PATH_OUTPUT ="temp/DataTestVariamos/HLVLFiles";

	private VariamosXMLToHlvlParser variamosXMLToHlvlParser;



				
	/**
	 * test included by avillota to test the changes in the HLVL grammar
	 */
	@Test
	public void smallTestStrings() {

		ParsingParameters params = new ParsingParameters();
		params.setInputPath(COMMON_PATH_INPUT+"smallTest");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("smallTest");
		String output="";
		String input = "<mxGraphModel>\n" + 
				"  <root>\n" + 
				"    <mxCell id=\"0\"/>\n" + 
				"    <mxCell id=\"feature\" parent=\"0\"/>\n" + 
				"    <root label=\"casa\" type=\"root\" id=\"1\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"420\" y=\"30\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </root>\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"2\">\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"330\" y=\"110\" width=\"35\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </bundle>\n" + 
				"    <general label=\"garaje\" type=\"general\" id=\"3\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"180\" y=\"210\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </general>\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"AND\" lowRange=\"1\" highRange=\"1\" id=\"4\">\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"660\" y=\"160\" width=\"35\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </bundle>\n" + 
				"    <leaf label=\"Ante-Jardin\" type=\"leaf\" selected=\"1\" id=\"5\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"360\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </leaf>\n" + 
				"    <rel_general_bundle type=\"relation\" id=\"6\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"3\" target=\"2\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_general_bundle>\n" + 
				"    <rel_leaf_bundle type=\"relation\" id=\"7\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"5\" target=\"2\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_leaf_bundle>\n" + 
				"    <leaf label=\"cocina\" type=\"leaf\" selected=\"1\" id=\"8\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"590\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </leaf>\n" + 
				"    <rel_leaf_bundle type=\"relation\" id=\"9\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"8\" target=\"4\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_leaf_bundle>\n" + 
				"    <rel_bundle_root type=\"relation\" id=\"10\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"4\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_bundle_root>\n" + 
				"    <rel_bundle_root type=\"relation\" id=\"11\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"2\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_bundle_root>\n" + 
				"    <general label=\"bano\" type=\"general\" id=\"12\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"720\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </general>\n" + 
				"    <rel_general_bundle type=\"relation\" id=\"13\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"12\" target=\"4\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_general_bundle>\n" + 
				"    <general label=\"cuartoPrincipal\" type=\"general\" id=\"14\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"160\" y=\"30\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </general>\n" + 
				"    <rel_general_root type=\"relation\" relType=\"mandatory\" id=\"15\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"14\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_general_root>\n" + 
				"    <general label=\"cuartoInvitador\" type=\"general\" id=\"16\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"660\" y=\"40\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </general>\n" + 
				"    <rel_general_root type=\"relation\" relType=\"optional\" id=\"17\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"16\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_general_root>\n" + 
				"    <rel_general_general type=\"relation\" relType=\"requires\" id=\"18\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"14\" target=\"3\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_general_general>\n" + 
				"    <rel_general_leaf type=\"relation\" relType=\"excludes\" id=\"19\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"16\" target=\"5\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_general_leaf>\n" + 
				"    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <leaf label=\"Ante-Jardin\" type=\"leaf\" selected=\"1\" id=\"clon5\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"360\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </leaf>\n" + 
				"    <leaf label=\"cocina\" type=\"leaf\" selected=\"1\" id=\"clon8\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"590\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </leaf>\n" + 
				"  </root>\n" + 
				"</mxGraphModel>\n" ;
		
		variamosXMLToHlvlParser = new VariamosXMLToHlvlParser(params);
		try {
			output= variamosXMLToHlvlParser.parse(input );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String resultado ="model  Auto_generated\n"+
				"elements: \n" + 
				"\tboolean casa\n" + 
				"\tboolean bano\n" + 
				"\tboolean garaje\n" + 
				"\tboolean cuartoPrincipal\n" + 
				"\tboolean AnteMinusJardin\n" + 
				"\tboolean cuartoInvitador\n" + 
				"\tboolean cocina\n" + 
				"relations:\n" + 
				"\tr0: common(casa)\n" + 
				"\tr1:group(casa,[garaje, AnteMinusJardin],[1,*])\n" + 
				"\tr2:group(casa,[cocina, bano],[1,1])\n"+ 
				"\tr3:decomposition(cuartoPrincipal,[casa],[1,1])\n" + 
				"\tr4:decomposition(casa,[cuartoInvitador],[0,1])\n" + 
				"\tr5: implies(cuartoPrincipal,garaje)\n" + 
				"\tr6: mutex(AnteMinusJardin, cuartoInvitador)\n";
		
		assertEquals(output, resultado);
		//System.out.println(output);
	}
	
	@Test
	public void GLPTest() {
		ParsingParameters params = new ParsingParameters();
		params.setInputPath("");
		params.setOutputPath("");
		params.setTargetName("");
		String output="";
		String input= "<mxGraphModel>\n" + 
				"  <root>\n" + 
				"    <mxCell id=\"0\"/>\n" + 
				"    <mxCell id=\"feature\" parent=\"0\"/>\n" + 
				"    <root label=\"GPL\" type=\"root\" id=\"1\">\n" + 
				"      <mxCell style=\"strokeWidth=3\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"390\" y=\"60\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </root>\n" + 
				"    <abstract label=\"GTP\" type=\"abstract\" id=\"2\">\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"60\" y=\"110\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </abstract>\n" + 
				"    <abstract label=\"Weight\" type=\"abstract\" id=\"3\">\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"250\" y=\"130\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </abstract>\n" + 
				"    <abstract label=\"Search\" type=\"abstract\" id=\"4\">\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"420\" y=\"150\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </abstract>\n" + 
				"    <abstract label=\"Algorithm\" type=\"abstract\" id=\"5\">\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"630\" y=\"110\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </abstract>\n" + 
				"    <abstract label=\"DFS\" type=\"abstract\" id=\"6\">\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"440\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </abstract>\n" + 
				"    <abstract label=\"BFS\" type=\"abstract\" id=\"7\">\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"570\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </abstract>\n" + 
				"    <concrete label=\"weighted\" type=\"concrete\" selected=\"false\" id=\"10\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"240\" y=\"320\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"unweighted\" type=\"concrete\" selected=\"false\" id=\"11\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"350\" y=\"310\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"12\">\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"290\" y=\"200\" width=\"35\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </bundle>\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"13\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"12\" target=\"3\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_bundle_abstract>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"14\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"10\" target=\"12\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"15\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"11\" target=\"12\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <concrete label=\"directed\" type=\"concrete\" selected=\"false\" id=\"16\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"20\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"undirected\" type=\"concrete\" selected=\"false\" id=\"17\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"140\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"optional\" id=\"18\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"3\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_abstract_root>\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"optional\" id=\"19\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"4\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_abstract_root>\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"20\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"2\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_abstract_root>\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"21\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"5\" target=\"1\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_abstract_root>\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"22\">\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"80\" y=\"160\" width=\"35\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </bundle>\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"23\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"22\" target=\"2\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_bundle_abstract>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"24\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"16\" target=\"22\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"25\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"17\" target=\"22\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"26\">\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"530\" y=\"190\" width=\"35\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </bundle>\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"27\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"26\" target=\"4\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_bundle_abstract>\n" + 
				"    <rel_abstract_bundle type=\"relation\" id=\"28\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"6\" target=\"26\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_abstract_bundle>\n" + 
				"    <rel_abstract_bundle type=\"relation\" id=\"29\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"7\" target=\"26\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_abstract_bundle>\n" + 
				"    <concrete label=\"connected\" type=\"concrete\" selected=\"false\" id=\"30\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"760\" y=\"160\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"stronglyc\" type=\"concrete\" selected=\"false\" id=\"31\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"770\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"cycle\" type=\"concrete\" selected=\"false\" id=\"32\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"770\" y=\"290\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"mstprim\" type=\"concrete\" selected=\"false\" id=\"33\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"800\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"RANGE\" lowRange=\"1\" highRange=\"6\" id=\"34\">\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"700\" y=\"190\" width=\"35\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </bundle>\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"35\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"34\" target=\"5\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_bundle_abstract>\n" + 
				"    <concrete label=\"mstkruskal\" type=\"concrete\" selected=\"false\" id=\"36\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"670\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"shortest\" type=\"concrete\" selected=\"false\" id=\"37\">\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\n" + 
				"        <mxGeometry x=\"570\" y=\"340\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"38\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"30\" target=\"34\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"39\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"31\" target=\"34\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"40\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"32\" target=\"34\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"41\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"36\" target=\"34\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"42\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"34\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"43\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"37\" target=\"34\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_bundle>\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"excludes\" id=\"44\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"31\" target=\"37\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_concrete>\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"requires\" id=\"45\">\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"11\">\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </rel_concrete_concrete>\n" + 
				"    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <concrete label=\"weighted\" type=\"concrete\" selected=\"false\" id=\"clon10\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"230\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"unweighted\" type=\"concrete\" selected=\"false\" id=\"clon11\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"360\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"directed\" type=\"concrete\" selected=\"false\" id=\"clon16\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"20\" y=\"220\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"undirected\" type=\"concrete\" selected=\"false\" id=\"clon17\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"140\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"connected\" type=\"concrete\" selected=\"false\" id=\"clon30\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"670\" y=\"170\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"stronglyc\" type=\"concrete\" selected=\"false\" id=\"clon31\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"690\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"cycle\" type=\"concrete\" selected=\"false\" id=\"clon32\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"700\" y=\"300\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"mstprim\" type=\"concrete\" selected=\"false\" id=\"clon33\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"710\" y=\"380\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"mstkruskal\" type=\"concrete\" selected=\"false\" id=\"clon36\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"610\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <concrete label=\"shortest\" type=\"concrete\" selected=\"false\" id=\"clon37\">\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\n" + 
				"        <mxGeometry x=\"520\" y=\"340\" width=\"100\" height=\"35\" as=\"geometry\"/>\n" + 
				"      </mxCell>\n" + 
				"    </concrete>\n" + 
				"    <mxCell id=\"istar\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <mxCell id=\"adaptation_state\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <mxCell id=\"adaptation_hardware\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <mxCell id=\"adaptation_binding_state_hardware\" parent=\"0\" visible=\"0\"/>\n" + 
				"    <mxCell id=\"control\" parent=\"0\" visible=\"0\"/>\n" + 
				"  </root>\n" + 
				"</mxGraphModel>";
		
		variamosXMLToHlvlParser = new VariamosXMLToHlvlParser(params);
		try {
			output= variamosXMLToHlvlParser.parse(input );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String resultado ="model  Auto_generated\n"+
							"elements:  \n" + 
							"	boolean GPL \n" + 
							"	boolean Gtp \n" + 
							"	boolean directed\n" + 
							"	boolean undirected\n" + 
							"	boolean Weight\n" + 
							"	boolean weighted\n" + 
							"	boolean unweighted\n" + 
							"	boolean Search\n" + 
							"	boolean BFS\n" + 
							"	boolean DFS\n" + 
							"	boolean Algorithms\n" + 
							"	boolean connected\n" + 
							"	boolean stronglyc\n" + 
							"	boolean cycle\n" + 
							"	boolean mstprim\n" + 
							"	boolean mstkruskal\n" + 
							"	boolean shortest\n" + 
							"relations:\n" + 
							"	R1: common(GPL)\n" + 
							"	R2: decomposition(GPL,[Weight, Search], [0,1])\n" + 
							"	R3: decomposition(GPL, [Gtp, Algorithms], [1,1])\n" + 
							"	R3X: group(Gtp, [directed, undirected], [1,1])\n" + 
							"	R4: group(Weight, [weighted, unweighted], [1,1])\n" + 
							"	R5: group(Search, [BFS, DFS], [1,1])\n" + 
							"	R6: group(Algorithms, [connected, stronglyc, cycle, mstprim, mstkruskal, shortest], [1,*])\n" + 
							"	R7: implies(mstprim, unweighted)\n" + 
							"	R8: mutex(stronglyc, shortest)";
		
		assertEquals(output, resultado);
		//System.out.println(output);
	}

	
}
