package com.coffee.modelParsers.VarToHLVL;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.coffee.modelParsers.utils.ParsingParameters;
import com.coffee.modelParsers.varXmlToHLVLParser.VariamosXMLToHlvlParser;

public class TestVariamosXmlToHlvlParser {

	public static final String COMMON_PATH_INPUT ="temp/DataTestVariamos/xmlToHLVLFiles/";
	public static final String COMMON_PATH_OUTPUT ="temp/DataTestVariamos/HLVLFiles";
	
	private VariamosXMLToHlvlParser varXmlToHlvlParser;
	
	@BeforeClass
	public void setUp() throws Exception 
	{
		varXmlToHlvlParser = new VariamosXMLToHlvlParser();
	}
	
	@Test
	public void InputStringCommonTest() {
		String xml = "<mxGraphModel>\r\n" + "  <root>\r\n" + "    <mxCell id=\"0\"/>\r\n"
				+ "    <mxCell id=\"feature\" parent=\"0\"/>\r\n"
				+ "    <root label=\"Casa\" type=\"root\" id=\"1\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"321\" y=\"20\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </root>\r\n"
				+ "    <general label=\"Bano\" type=\"general\" id=\"2\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"200\" y=\"200\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Cocina\" type=\"general\" id=\"4\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"340\" y=\"200\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"6\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"355.5\" y=\"100\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n" + "    <rel_bundle_root type=\"relation\" id=\"7\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"6\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_root>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"8\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"4\" target=\"6\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"9\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"2\" target=\"6\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"10\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"220\" y=\"280\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n"
				+ "    <rel_bundle_general type=\"relation\" id=\"11\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"10\" target=\"2\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_general>\r\n"
				+ "    <leaf label=\"Banera\" type=\"leaf\" selected=\"1\" id=\"12\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"110\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"ducha\" type=\"leaf\" selected=\"1\" id=\"13\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"280\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n" + "    <rel_leaf_bundle type=\"relation\" id=\"14\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"12\" target=\"10\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_bundle>\r\n" + "    <rel_leaf_bundle type=\"relation\" id=\"15\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"13\" target=\"10\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_bundle>\r\n"
				+ "    <leaf label=\"Lava Platos\" type=\"leaf\" selected=\"1\" id=\"17\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"390\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"mandatory\" id=\"18\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"17\" target=\"4\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n" + "    <leaf label=\"Orno\" type=\"leaf\" selected=\"1\" id=\"19\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"580\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"optional\" id=\"20\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"19\" target=\"4\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n"
				+ "    <general label=\"Cuarto Principal\" type=\"general\" id=\"21\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"199\" y=\"130\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"22\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"21\" target=\"6\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <general label=\"Cuarto secundario\" type=\"general\" id=\"23\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"24.5\" y=\"94.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"24\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"23\" target=\"6\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"requires\" id=\"26\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"21\" target=\"2\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"optional\" id=\"27\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"23\" target=\"2\">\r\n"
				+ "        <mxGeometry x=\"-0.0092\" y=\"-4\" relative=\"1\" as=\"geometry\">\r\n"
				+ "          <mxPoint as=\"offset\"/>\r\n" + "        </mxGeometry>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n" + "    <general label=\"Garaje\" type=\"general\" id=\"28\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"446.5\" y=\"104.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_root type=\"relation\" relType=\"optional\" id=\"29\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"28\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_root>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"30\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"611\" y=\"70\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n" + "    <rel_bundle_root type=\"relation\" id=\"31\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"30\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_root>\r\n" + "    <general label=\"Biblioteca\" type=\"general\" id=\"32\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"630\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Sala de juegos\" type=\"general\" id=\"33\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"800\" y=\"120\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"34\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"32\" target=\"30\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"35\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"30\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"excludes\" id=\"36\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"32\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n" + "    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\r\n"
				+ "    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\r\n"
				+ "    <leaf label=\"Banera\" type=\"leaf\" selected=\"1\" id=\"clon12\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"560\" y=\"200\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"ducha\" type=\"leaf\" selected=\"1\" id=\"clon13\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"280\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Lava Platos\" type=\"leaf\" selected=\"1\" id=\"clon17\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"390\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Orno\" type=\"leaf\" selected=\"1\" id=\"clon19\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"580\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n" + "  </root>\r\n" + "</mxGraphModel>";
	
		String result = "model  Auto_generated\n" + 
				"elements: \n" + 
				"	boolean Sala_de_juegos\n" + 
				"	boolean Banera\n" + 
				"	boolean Cuarto_secundario\n" + 
				"	boolean ducha\n" + 
				"	boolean Lava_Platos\n" + 
				"	boolean Garaje\n" + 
				"	boolean Orno\n" + 
				"	boolean Casa\n" + 
				"	boolean Bano\n" + 
				"	boolean Cocina\n" + 
				"	boolean Cuarto_Principal\n" + 
				"	boolean Biblioteca\n" + 
				"relations:\n" + 
				"	r0: common(Casa)\n" + 
				"	r1:group(Casa,[Cocina, Bano, Cuarto_Principal, Cuarto_secundario])[1,*]\n" + 
				"	r2:group(Casa,[Biblioteca, Sala_de_juegos])[1,*]\n" + 
				"	r3:group(Bano,[Banera, ducha])[1,*]\n" + 
				"	r4:decomposition(Lava_Platos,[Cocina])<1>\n" + 
				"	r5:decomposition(Cocina,[Orno])<0>\n" + 
				"	r6: implies(Cuarto_Principal,Bano)\n" + 
				"	r7:decomposition(Bano,[Cuarto_secundario])<0>\n" + 
				"	r8:decomposition(Casa,[Garaje])<0>\n" + 
				"	r9: mutex(Biblioteca, Sala_de_juegos)\n";
		try {
			String variamosResult = varXmlToHlvlParser.parse(xml);
			
			assertTrue(result.equals(variamosResult));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void InputStringSmallTest() {
		String xml = "<mxGraphModel>\r\n" + "  <root>\r\n" + "    <mxCell id=\"0\"/>\r\n"
				+ "    <mxCell id=\"feature\" parent=\"0\"/>\r\n"
				+ "    <root label=\"casa\" type=\"root\" id=\"1\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"420\" y=\"30\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </root>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"2\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"330\" y=\"110\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n"
				+ "    <general label=\"garaje\" type=\"general\" id=\"3\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"180\" y=\"210\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"AND\" lowRange=\"1\" highRange=\"1\" id=\"4\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"660\" y=\"160\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n"
				+ "    <leaf label=\"Ante-Jardin\" type=\"leaf\" selected=\"1\" id=\"5\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"360\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"6\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"3\" target=\"2\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_leaf_bundle type=\"relation\" id=\"7\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"5\" target=\"2\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_bundle>\r\n" + "    <leaf label=\"cocina\" type=\"leaf\" selected=\"1\" id=\"8\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"590\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n" + "    <rel_leaf_bundle type=\"relation\" id=\"9\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"8\" target=\"4\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_bundle>\r\n" + "    <rel_bundle_root type=\"relation\" id=\"10\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"4\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_root>\r\n" + "    <rel_bundle_root type=\"relation\" id=\"11\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"2\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_root>\r\n" + "    <general label=\"bano\" type=\"general\" id=\"12\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"720\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"13\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"12\" target=\"4\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <general label=\"cuartoPrincipal\" type=\"general\" id=\"14\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"160\" y=\"30\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_root type=\"relation\" relType=\"mandatory\" id=\"15\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"14\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_root>\r\n"
				+ "    <general label=\"cuartoInvitador\" type=\"general\" id=\"16\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"660\" y=\"40\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_root type=\"relation\" relType=\"optional\" id=\"17\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"16\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_root>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"requires\" id=\"18\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"14\" target=\"3\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_leaf type=\"relation\" relType=\"excludes\" id=\"19\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"16\" target=\"5\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_leaf>\r\n" + "    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\r\n"
				+ "    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\r\n"
				+ "    <leaf label=\"Ante-Jardin\" type=\"leaf\" selected=\"1\" id=\"clon5\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"360\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"cocina\" type=\"leaf\" selected=\"1\" id=\"clon8\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"590\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n" + "  </root>\r\n" + "</mxGraphModel>";
		
		String result = "model  Auto_generated\n" + 
				"elements: \n" + 
				"	boolean casa\n" + 
				"	boolean bano\n" + 
				"	boolean garaje\n" + 
				"	boolean cuartoPrincipal\n" + 
				"	boolean AnteMinusJardin\n" + 
				"	boolean cuartoInvitador\n" + 
				"	boolean cocina\n" + 
				"relations:\n" + 
				"	r0: common(casa)\n" + 
				"	r1:group(casa,[garaje, AnteMinusJardin])[1,*]\n" + 
				"	r2:group(casa,[cocina, bano])[1,1]\n"+				
				"	r3:decomposition(cuartoPrincipal,[casa])<1>\n" + 
				"	r4:decomposition(casa,[cuartoInvitador])<0>\n" + 
				"	r5: implies(cuartoPrincipal,garaje)\n" + 
				"	r6: mutex(AnteMinusJardin, cuartoInvitador)\n";

		try {
			String variamosResult = varXmlToHlvlParser.parse(xml);
		
			assertTrue(result.equals(variamosResult));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void InputStringBigTest() {
		String xml = "<mxGraphModel>\r\n" + "  <root>\r\n" + "    <mxCell id=\"0\"/>\r\n"
				+ "    <mxCell id=\"feature\" parent=\"0\"/>\r\n"
				+ "    <root label=\"Universidad\" type=\"root\" id=\"1\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"380\" y=\"20\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </root>\r\n"
				+ "    <general label=\"Direccion Academica\" type=\"general\" id=\"2\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"45.5\" y=\"72\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"3\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"260\" y=\"80\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"4\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"2\" target=\"3\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_bundle_root type=\"relation\" id=\"5\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"3\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_root>\r\n"
				+ "    <general label=\"Departamento de finanzas\" type=\"general\" id=\"6\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"26\" y=\"140\" width=\"130\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"7\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"6\" target=\"3\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <general label=\"Departamento de recursos humanos\" type=\"general\" id=\"8\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"14.5\" y=\"6.5\" width=\"190\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"9\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"8\" target=\"3\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <general label=\"Departamento de investigacion\" type=\"general\" id=\"10\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"96.5\" y=\"236.5\" width=\"150\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Departamento TIC\" type=\"general\" id=\"11\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"694\" y=\"201\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Departamento de ingenieria\" type=\"general\" id=\"12\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"821.5\" y=\"181\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Departamento de economia\" type=\"general\" id=\"13\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"838\" y=\"94\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Departamento de humanidades\" type=\"general\" id=\"14\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"854.5\" y=\"54.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Departamento de Salud\" type=\"general\" id=\"15\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"834\" y=\"139.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Departamento de ciencias exactas\" type=\"general\" id=\"16\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"517\" y=\"216.5\" width=\"160\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Bienestar Universitario\" type=\"general\" id=\"17\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"272\" y=\"312\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"AND\" lowRange=\"1\" highRange=\"1\" id=\"21\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"690\" y=\"70\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n"
				+ "    <rel_general_bundle type=\"relation\" id=\"22\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"16\" target=\"21\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"23\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"14\" target=\"21\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"24\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"13\" target=\"21\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"25\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"15\" target=\"21\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"26\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"12\" target=\"21\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"27\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"11\" target=\"21\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_bundle_root type=\"relation\" id=\"28\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"21\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_root>\r\n"
				+ "    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"29\">\r\n"
				+ "      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"364.5\" y=\"124.5\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </bundle>\r\n" + "    <rel_bundle_root type=\"relation\" id=\"30\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"29\" target=\"1\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_bundle_root>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"31\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"10\" target=\"29\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n" + "    <rel_general_bundle type=\"relation\" id=\"32\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"17\" target=\"29\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_bundle>\r\n"
				+ "    <general label=\"Jefe de departamento\" type=\"general\" id=\"33\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"934.5\" y=\"271\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"34\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"16\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"35\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"11\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"36\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"12\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"37\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"15\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"38\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"13\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"39\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"33\" target=\"14\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <general label=\"Ingenieria Sistemas\" type=\"general\" id=\"40\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"580\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Ingenieria Telematica\" type=\"general\" id=\"41\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"600\" y=\"400\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Ingenieria Industria\" type=\"general\" id=\"42\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"810\" y=\"370\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"43\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"40\" target=\"11\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"44\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"41\" target=\"11\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <general label=\"Ingenieria civil\" type=\"general\" id=\"45\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"960\" y=\"360\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Ingenieria electrica\" type=\"general\" id=\"46\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"1190\" y=\"360\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"47\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"42\" target=\"12\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"48\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"45\" target=\"12\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"optional\" id=\"49\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"46\" target=\"12\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"excludes\" id=\"50\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"46\" target=\"45\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <general label=\"Administracion\" type=\"general\" id=\"51\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"1130\" y=\"150\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Economia y finanzas esteriores\" type=\"general\" id=\"52\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"1150\" y=\"210\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"53\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"52\" target=\"13\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"54\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"51\" target=\"13\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n" + "    <general label=\"Sociologia\" type=\"general\" id=\"55\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"1140\" y=\"50\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Sicologia\" type=\"general\" id=\"56\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"1180\" y=\"100\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Antropologia\" type=\"general\" id=\"57\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"1030\" y=\"30\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"58\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"56\" target=\"14\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"optional\" id=\"59\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"55\" target=\"14\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"optional\" id=\"60\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"57\" target=\"14\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n" + "    <general label=\"Musica\" type=\"general\" id=\"62\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"900\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"63\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"62\" target=\"14\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"requires\" id=\"64\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"57\" target=\"62\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <general label=\"Director de carrera\" type=\"general\" id=\"65\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"878\" y=\"460.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <general label=\"Director de estudiantes\" type=\"general\" id=\"66\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"264.5\" y=\"420\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"67\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"66\" target=\"17\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"68\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"40\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"69\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"41\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"70\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"42\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"71\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"45\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"72\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"46\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"73\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"52\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"74\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"51\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"75\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"56\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"76\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"55\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"77\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"57\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"mandatory\" id=\"78\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"65\" target=\"62\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <leaf label=\"I2T\" type=\"leaf\" selected=\"1\" id=\"80\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"101\" y=\"320\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"mandatory\" id=\"81\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"80\" target=\"10\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n"
				+ "    <general label=\"Investigacion Estudiantil\" type=\"general\" id=\"82\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"12\" y=\"372\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </general>\r\n"
				+ "    <rel_general_general type=\"relation\" relType=\"optional\" id=\"83\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"82\" target=\"10\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_general_general>\r\n"
				+ "    <leaf label=\"Voluntariado Investigacion\" type=\"leaf\" selected=\"1\" id=\"84\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry y=\"454.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"optional\" id=\"85\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"84\" target=\"82\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n"
				+ "    <leaf label=\"Monitores Investigacion\" type=\"leaf\" selected=\"1\" id=\"86\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"180\" y=\"480\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"mandatory\" id=\"87\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"86\" target=\"82\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n"
				+ "    <leaf label=\"Programas de acompanamiento\" type=\"leaf\" selected=\"1\" id=\"88\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"380\" y=\"395.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"mandatory\" id=\"89\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"88\" target=\"17\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n"
				+ "    <leaf label=\"Sicologos\" type=\"leaf\" selected=\"1\" id=\"90\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"441\" y=\"460\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Profesores Deportes\" type=\"leaf\" selected=\"1\" id=\"91\">\r\n"
				+ "      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n"
				+ "        <mxGeometry x=\"320\" y=\"520\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"optional\" id=\"92\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"90\" target=\"66\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n"
				+ "    <rel_leaf_general type=\"relation\" relType=\"optional\" id=\"93\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"91\" target=\"66\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_general>\r\n"
				+ "    <rel_leaf_leaf type=\"relation\" relType=\"excludes\" id=\"94\">\r\n"
				+ "      <mxCell edge=\"1\" parent=\"feature\" source=\"91\" target=\"90\">\r\n"
				+ "        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + "      </mxCell>\r\n"
				+ "    </rel_leaf_leaf>\r\n" + "    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\r\n"
				+ "    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\r\n"
				+ "    <leaf label=\"I2T\" type=\"leaf\" selected=\"1\" id=\"clon80\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"40\" y=\"320\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Voluntariado Investigacion\" type=\"leaf\" selected=\"1\" id=\"clon84\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"50\" y=\"430\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Monitores Investigacion\" type=\"leaf\" selected=\"1\" id=\"clon86\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"180\" y=\"480\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Programas de acompanamiento\" type=\"leaf\" selected=\"1\" id=\"clon88\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"430\" y=\"410\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Sicologos\" type=\"leaf\" selected=\"1\" id=\"clon90\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"380\" y=\"460\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n"
				+ "    <leaf label=\"Profesores Deportes\" type=\"leaf\" selected=\"1\" id=\"clon91\">\r\n"
				+ "      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n"
				+ "        <mxGeometry x=\"390\" y=\"510\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n"
				+ "      </mxCell>\r\n" + "    </leaf>\r\n" + "  </root>\r\n" + "</mxGraphModel>";
		
		String result = "model  Auto_generated\n" + 
				"elements: \n" + 
				"	boolean Director_de_estudiantes\n" + 
				"	boolean Programas_de_acompanamiento\n" + 
				"	boolean Ingenieria_civil\n" + 
				"	boolean Ingenieria_electrica\n" + 
				"	boolean Sicologos\n" + 
				"	boolean Profesores_Deportes\n" + 
				"	boolean Administracion\n" + 
				"	boolean Economia_y_finanzas_esteriores\n" + 
				"	boolean Departamento_de_investigacion\n" + 
				"	boolean Departamento_TIC\n" + 
				"	boolean Jefe_de_departamento\n" + 
				"	boolean Sociologia\n" + 
				"	boolean Departamento_de_ingenieria\n" + 
				"	boolean Sicologia\n" + 
				"	boolean Departamento_de_economia\n" + 
				"	boolean Antropologia\n" + 
				"	boolean Departamento_de_humanidades\n" + 
				"	boolean Departamento_de_Salud\n" + 
				"	boolean Departamento_de_ciencias_exactas\n" + 
				"	boolean Bienestar_Universitario\n" + 
				"	boolean Universidad\n" + 
				"	boolean Direccion_Academica\n" + 
				"	boolean Departamento_de_finanzas\n" + 
				"	boolean Departamento_de_recursos_humanos\n" + 
				"	boolean I2T\n" + 
				"	boolean Investigacion_Estudiantil\n" + 
				"	boolean Ingenieria_Sistemas\n" + 
				"	boolean Musica\n" + 
				"	boolean Voluntariado_Investigacion\n" + 
				"	boolean Ingenieria_Telematica\n" + 
				"	boolean Ingenieria_Industria\n" + 
				"	boolean Monitores_Investigacion\n" + 
				"	boolean Director_de_carrera\n" + 
				"relations:\n" + 
				"	r0:group(Universidad,[Departamento_de_investigacion, Bienestar_Universitario])[1,*]\n" + 
				"	r1: common(Universidad)\n" + 
				"	r2:group(Universidad,[Direccion_Academica, Departamento_de_finanzas, Departamento_de_recursos_humanos])[1,*]\n" + 
				"	r3:group(Universidad,[Departamento_de_ciencias_exactas, Departamento_de_humanidades, Departamento_de_economia, Departamento_de_Salud, Departamento_de_ingenieria, Departamento_TIC])[1,1]\n"+
				"	r4:decomposition(Jefe_de_departamento,[Departamento_de_ciencias_exactas])<1>\n" + 
				"	r5:decomposition(Jefe_de_departamento,[Departamento_TIC])<1>\n" + 
				"	r6:decomposition(Jefe_de_departamento,[Departamento_de_ingenieria])<1>\n" + 
				"	r7:decomposition(Jefe_de_departamento,[Departamento_de_Salud])<1>\n" + 
				"	r8:decomposition(Jefe_de_departamento,[Departamento_de_economia])<1>\n" + 
				"	r9:decomposition(Jefe_de_departamento,[Departamento_de_humanidades])<1>\n" + 
				"	r10:decomposition(Ingenieria_Sistemas,[Departamento_TIC])<1>\n" + 
				"	r11:decomposition(Ingenieria_Telematica,[Departamento_TIC])<1>\n" + 
				"	r12:decomposition(Ingenieria_Industria,[Departamento_de_ingenieria])<1>\n" + 
				"	r13:decomposition(Ingenieria_civil,[Departamento_de_ingenieria])<1>\n" + 
				"	r14:decomposition(Departamento_de_ingenieria,[Ingenieria_electrica])<0>\n" + 
				"	r15: mutex(Ingenieria_civil, Ingenieria_electrica)\n" + 
				"	r16:decomposition(Economia_y_finanzas_esteriores,[Departamento_de_economia])<1>\n" + 
				"	r17:decomposition(Administracion,[Departamento_de_economia])<1>\n" + 
				"	r18:decomposition(Sicologia,[Departamento_de_humanidades])<1>\n" + 
				"	r19:decomposition(Departamento_de_humanidades,[Sociologia])<0>\n" + 
				"	r20:decomposition(Departamento_de_humanidades,[Antropologia])<0>\n" + 
				"	r21:decomposition(Musica,[Departamento_de_humanidades])<1>\n" + 
				"	r22: implies(Antropologia,Musica)\n" + 
				"	r23:decomposition(Director_de_estudiantes,[Bienestar_Universitario])<1>\n" + 
				"	r24:decomposition(Director_de_carrera,[Ingenieria_Sistemas])<1>\n" + 
				"	r25:decomposition(Director_de_carrera,[Ingenieria_Telematica])<1>\n" + 
				"	r26:decomposition(Director_de_carrera,[Ingenieria_Industria])<1>\n" + 
				"	r27:decomposition(Director_de_carrera,[Ingenieria_civil])<1>\n" + 
				"	r28:decomposition(Director_de_carrera,[Ingenieria_electrica])<1>\n" + 
				"	r29:decomposition(Director_de_carrera,[Economia_y_finanzas_esteriores])<1>\n" + 
				"	r30:decomposition(Director_de_carrera,[Administracion])<1>\n" + 
				"	r31:decomposition(Director_de_carrera,[Sicologia])<1>\n" + 
				"	r32:decomposition(Director_de_carrera,[Sociologia])<1>\n" + 
				"	r33:decomposition(Director_de_carrera,[Antropologia])<1>\n" + 
				"	r34:decomposition(Director_de_carrera,[Musica])<1>\n" + 
				"	r35:decomposition(I2T,[Departamento_de_investigacion])<1>\n" + 
				"	r36:decomposition(Departamento_de_investigacion,[Investigacion_Estudiantil])<0>\n" + 
				"	r37:decomposition(Investigacion_Estudiantil,[Voluntariado_Investigacion])<0>\n" + 
				"	r38:decomposition(Monitores_Investigacion,[Investigacion_Estudiantil])<1>\n" + 
				"	r39:decomposition(Programas_de_acompanamiento,[Bienestar_Universitario])<1>\n" + 
				"	r40:decomposition(Director_de_estudiantes,[Sicologos])<0>\n" + 
				"	r41:decomposition(Director_de_estudiantes,[Profesores_Deportes])<0>\n" + 
				"	r42: mutex(Sicologos, Profesores_Deportes)\n";

		try {
			String variamosResult = varXmlToHlvlParser.parse(xml);
			assertTrue(result.equals(variamosResult));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void CommonTest() {

		ParsingParameters params = new ParsingParameters();
		params.setInputPath(COMMON_PATH_INPUT+"commonTest");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("commonTest");
		varXmlToHlvlParser.setParams(params);
		try {
			varXmlToHlvlParser.parse();
		} catch (Exception e) {
		
			e.printStackTrace();
		}

		String resultado = "model  commonTest_generated\n" + "elements: \n" + "	boolean Sala_de_juegos\n"
				+ "	boolean Banera\n" + "	boolean Cuarto_secundario\n" + "	boolean ducha\n"
				+ "	boolean Lava_Platos\n" + "	boolean Garaje\n" + "	boolean Orno\n" + "	boolean Casa\n"
				+ "	boolean Bano\n" + "	boolean Cocina\n" + "	boolean Cuarto_Principal\n"
				+ "	boolean Biblioteca\n" + "relations:\n" + "	r0: common(Casa)\n"
				+ "	r1:group(Casa,[Cocina, Bano, Cuarto_Principal, Cuarto_secundario])[1,*]\n"
				+ "	r2:group(Casa,[Biblioteca, Sala_de_juegos])[1,*]\n" + "	r3:group(Bano,[Banera, ducha])[1,*]\n"
				+ "	r4:decomposition(Lava_Platos,[Cocina])<1>\n" + "	r5:decomposition(Cocina,[Orno])<0>\n"
				+ "	r6: implies(Cuarto_Principal,Bano)\n" + "	r7:decomposition(Bano,[Cuarto_secundario])<0>\n"
				+ "	r8:decomposition(Casa,[Garaje])<0>\n" + "	r9: mutex(Biblioteca, Sala_de_juegos)\n";
		try {
			File file = new File(COMMON_PATH_OUTPUT+"/commonTest.hlvl");
			FileReader f = new FileReader(file);
			BufferedReader in = new BufferedReader(f);
			String linea = in.readLine();
			String datosHLVL = "";
			while (!linea.equals("")) {
				datosHLVL += linea + "\n";
				linea = in.readLine();
			}
			assertTrue(datosHLVL.equals(resultado));
			in.close();
			f.close();
		} catch (IOException e) {
			fail();
		}

	}

	@Test
	public void smallTest() {

		ParsingParameters params = new ParsingParameters();
		params.setInputPath(COMMON_PATH_INPUT+"smallTest");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("smallTest");
		varXmlToHlvlParser.setParams(params);;
		try {
			varXmlToHlvlParser.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String resultado ="model  smallTest_generated\n"+
				"elements: \n" + 
				"	boolean casa\n" + 
				"	boolean bano\n" + 
				"	boolean garaje\n" + 
				"	boolean cuartoPrincipal\n" + 
				"	boolean AnteMinusJardin\n" + 
				"	boolean cuartoInvitador\n" + 
				"	boolean cocina\n" + 
				"relations:\n" + 
				"	r0: common(casa)\n" + 
				"	r1:group(casa,[garaje, AnteMinusJardin],[1,*])\n" + 
				"	r2:group(casa,[cocina, bano],[1,1])\n"+ 
				"	r3:decomposition(cuartoPrincipal,[casa],[1,1])\n" + 
				"	r4:decomposition(casa,[cuartoInvitador],[1,0])\n" + 
				"	r5: implies(cuartoPrincipal,garaje)\n" + 
				"	r6: mutex(AnteMinusJardin, cuartoInvitador)\n";

		try {
			File file = new File(COMMON_PATH_OUTPUT+"/smallTest.hlvl");
			FileReader f = new FileReader(file);
			BufferedReader in = new BufferedReader(f);
			String linea = in.readLine();
			String datosHLVL = "";
			while (!linea.equals("")) {
				datosHLVL += linea + "\n";
				linea = in.readLine();
			}
		
			assertEquals(datosHLVL, resultado);
			in.close();
			f.close();
		} catch (IOException e) {
			fail();
		}
	}
	
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
		
		varXmlToHlvlParser.setParams(params);
		try {
			output= varXmlToHlvlParser.parse(input);
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
		params.setInputPath(COMMON_PATH_INPUT+"smallTest");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("smallTest");
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
		
		varXmlToHlvlParser.setParams(params);
		try {
			output= varXmlToHlvlParser.parse(input );
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

	@Test
	public void bigTest() {

		ParsingParameters params = new ParsingParameters();
		params.setInputPath(COMMON_PATH_INPUT+"bigTest");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("bigTest");
		varXmlToHlvlParser.setParams(params);;
		try {
			varXmlToHlvlParser.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String resultado = "model  bigTest_generated\n" + 
				"elements: \n" + 
				"	boolean Director_de_estudiantes\n" + 
				"	boolean Programas_de_acompanamiento\n" + 
				"	boolean Ingenieria_civil\n" + 
				"	boolean Ingenieria_electrica\n" + 
				"	boolean Sicologos\n" + 
				"	boolean Profesores_Deportes\n" + 
				"	boolean Administracion\n" + 
				"	boolean Economia_y_finanzas_esteriores\n" + 
				"	boolean Departamento_de_investigacion\n" + 
				"	boolean Departamento_TIC\n" + 
				"	boolean Jefe_de_departamento\n" + 
				"	boolean Sociologia\n" + 
				"	boolean Departamento_de_ingenieria\n" + 
				"	boolean Sicologia\n" + 
				"	boolean Departamento_de_economia\n" + 
				"	boolean Antropologia\n" + 
				"	boolean Departamento_de_humanidades\n" + 
				"	boolean Departamento_de_Salud\n" + 
				"	boolean Departamento_de_ciencias_exactas\n" + 
				"	boolean Bienestar_Universitario\n" + 
				"	boolean Universidad\n" + 
				"	boolean Direccion_Academica\n" + 
				"	boolean Departamento_de_finanzas\n" + 
				"	boolean Departamento_de_recursos_humanos\n" + 
				"	boolean I2T\n" + 
				"	boolean Investigacion_Estudiantil\n" + 
				"	boolean Ingenieria_Sistemas\n" + 
				"	boolean Musica\n" + 
				"	boolean Voluntariado_Investigacion\n" + 
				"	boolean Ingenieria_Telematica\n" + 
				"	boolean Ingenieria_Industria\n" + 
				"	boolean Monitores_Investigacion\n" + 
				"	boolean Director_de_carrera\n" + 
				"relations:\n" + 
				"	r0:group(Universidad,[Departamento_de_investigacion, Bienestar_Universitario])[1,*]\n" + 
				"	r1: common(Universidad)\n" + 
				"	r2:group(Universidad,[Direccion_Academica, Departamento_de_finanzas, Departamento_de_recursos_humanos])[1,*]\n" + 
				"	r3:group(Universidad,[Departamento_de_ciencias_exactas, Departamento_de_humanidades, Departamento_de_economia, Departamento_de_Salud, Departamento_de_ingenieria, Departamento_TIC])[1,1]\n"+
				"	r4:decomposition(Jefe_de_departamento,[Departamento_de_ciencias_exactas])<1>\n" + 
				"	r5:decomposition(Jefe_de_departamento,[Departamento_TIC])<1>\n" + 
				"	r6:decomposition(Jefe_de_departamento,[Departamento_de_ingenieria])<1>\n" + 
				"	r7:decomposition(Jefe_de_departamento,[Departamento_de_Salud])<1>\n" + 
				"	r8:decomposition(Jefe_de_departamento,[Departamento_de_economia])<1>\n" + 
				"	r9:decomposition(Jefe_de_departamento,[Departamento_de_humanidades])<1>\n" + 
				"	r10:decomposition(Ingenieria_Sistemas,[Departamento_TIC])<1>\n" + 
				"	r11:decomposition(Ingenieria_Telematica,[Departamento_TIC])<1>\n" + 
				"	r12:decomposition(Ingenieria_Industria,[Departamento_de_ingenieria])<1>\n" + 
				"	r13:decomposition(Ingenieria_civil,[Departamento_de_ingenieria])<1>\n" + 
				"	r14:decomposition(Departamento_de_ingenieria,[Ingenieria_electrica])<0>\n" + 
				"	r15: mutex(Ingenieria_civil, Ingenieria_electrica)\n" + 
				"	r16:decomposition(Economia_y_finanzas_esteriores,[Departamento_de_economia])<1>\n" + 
				"	r17:decomposition(Administracion,[Departamento_de_economia])<1>\n" + 
				"	r18:decomposition(Sicologia,[Departamento_de_humanidades])<1>\n" + 
				"	r19:decomposition(Departamento_de_humanidades,[Sociologia])<0>\n" + 
				"	r20:decomposition(Departamento_de_humanidades,[Antropologia])<0>\n" + 
				"	r21:decomposition(Musica,[Departamento_de_humanidades])<1>\n" + 
				"	r22: implies(Antropologia,Musica)\n" + 
				"	r23:decomposition(Director_de_estudiantes,[Bienestar_Universitario])<1>\n" + 
				"	r24:decomposition(Director_de_carrera,[Ingenieria_Sistemas])<1>\n" + 
				"	r25:decomposition(Director_de_carrera,[Ingenieria_Telematica])<1>\n" + 
				"	r26:decomposition(Director_de_carrera,[Ingenieria_Industria])<1>\n" + 
				"	r27:decomposition(Director_de_carrera,[Ingenieria_civil])<1>\n" + 
				"	r28:decomposition(Director_de_carrera,[Ingenieria_electrica])<1>\n" + 
				"	r29:decomposition(Director_de_carrera,[Economia_y_finanzas_esteriores])<1>\n" + 
				"	r30:decomposition(Director_de_carrera,[Administracion])<1>\n" + 
				"	r31:decomposition(Director_de_carrera,[Sicologia])<1>\n" + 
				"	r32:decomposition(Director_de_carrera,[Sociologia])<1>\n" + 
				"	r33:decomposition(Director_de_carrera,[Antropologia])<1>\n" + 
				"	r34:decomposition(Director_de_carrera,[Musica])<1>\n" + 
				"	r35:decomposition(I2T,[Departamento_de_investigacion])<1>\n" + 
				"	r36:decomposition(Departamento_de_investigacion,[Investigacion_Estudiantil])<0>\n" + 
				"	r37:decomposition(Investigacion_Estudiantil,[Voluntariado_Investigacion])<0>\n" + 
				"	r38:decomposition(Monitores_Investigacion,[Investigacion_Estudiantil])<1>\n" + 
				"	r39:decomposition(Programas_de_acompanamiento,[Bienestar_Universitario])<1>\n" + 
				"	r40:decomposition(Director_de_estudiantes,[Sicologos])<0>\n" + 
				"	r41:decomposition(Director_de_estudiantes,[Profesores_Deportes])<0>\n" + 
				"	r42: mutex(Sicologos, Profesores_Deportes)\n";


		try {
			File file = new File(COMMON_PATH_OUTPUT+"/bigTest.hlvl");
			FileReader f = new FileReader(file);
			BufferedReader in = new BufferedReader(f);
			String linea = in.readLine();
			String datosHLVL = "";
			while (!linea.equals("")) {
				datosHLVL += linea + "\n";
				linea = in.readLine();
			}
			assertTrue(datosHLVL.equals(resultado));
			in.close();
			f.close();
		} catch (IOException e) {
			fail();
		}

	}


	@Test
	public void InputStringCommonTest2()
	{
		String xml = "<mxGraphModel>\r\n" + 
				"  <root>\r\n" + 
				"    <mxCell id=\"0\"/>\r\n" + 
				"    <mxCell id=\"feature\" parent=\"0\"/>\r\n" + 
				"    <root label=\"Smart Home\" type=\"root\" id=\"1\">\r\n" + 
				"      <mxCell style=\"strokeWidth=3\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"558\" y=\"10\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </root>\r\n" + 
				"    <concrete label=\"Lighting\" type=\"concrete\" selected=\"false\" id=\"2\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"100\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_root type=\"relation\" relType=\"mandatory\" id=\"3\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"2\" target=\"1\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_root>\r\n" + 
				"    <concrete label=\"Anti-theft Alarm\" type=\"concrete\" selected=\"false\" id=\"6\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"320\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_root type=\"relation\" relType=\"optional\" id=\"7\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"6\" target=\"1\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_root>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"14\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"95\" y=\"210\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Cellphone\" type=\"concrete\" selected=\"false\" id=\"15\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"16\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"15\" target=\"14\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"Control Panel\" type=\"concrete\" selected=\"false\" id=\"18\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"117.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"19\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"18\" target=\"14\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"20\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"367.5\" y=\"210\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"HDTV42\" type=\"concrete\" selected=\"false\" id=\"22\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"227.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"PCPlayer\" type=\"concrete\" selected=\"false\" id=\"23\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"337.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"HDTV32\" type=\"concrete\" selected=\"false\" id=\"24\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"447.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"25\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"22\" target=\"20\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"26\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"23\" target=\"20\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"27\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"24\" target=\"20\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"32\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"637.5\" y=\"210\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Digital Media Server\" type=\"concrete\" selected=\"false\" id=\"35\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"667.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"36\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"35\" target=\"32\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"Cache\" type=\"concrete\" selected=\"false\" id=\"45\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"600\" y=\"390\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"47\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"520\" y=\"450\" width=\"35\" height=\"40\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Provider A\" type=\"concrete\" selected=\"false\" id=\"49\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"430\" y=\"520\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"50\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"49\" target=\"47\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"Provider B\" type=\"concrete\" selected=\"false\" id=\"51\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"540\" y=\"520\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"52\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"51\" target=\"47\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"Ethernet\" type=\"concrete\" selected=\"false\" id=\"54\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"777.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"3G\" type=\"concrete\" selected=\"false\" id=\"55\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"887.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Wifi-b\" type=\"concrete\" selected=\"false\" id=\"56\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"997.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Wifi-n\" type=\"concrete\" selected=\"false\" id=\"57\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"1107.5\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"62\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"960\" y=\"200\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"63\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"54\" target=\"62\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"64\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"55\" target=\"62\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"65\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"56\" target=\"62\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"66\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"57\" target=\"62\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <abstract label=\"ControlSystem\" type=\"abstract\" id=\"68\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"210\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"69\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"14\" target=\"68\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"70\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"68\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <abstract label=\"MoviePlayers\" type=\"abstract\" id=\"72\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"430\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"73\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"20\" target=\"72\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <abstract label=\"Contents\" type=\"abstract\" id=\"74\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"607.5\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"optional\" id=\"75\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"72\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"optional\" id=\"76\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"74\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <abstract label=\"VideoOnDemand\" type=\"abstract\" id=\"78\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"560\" y=\"280\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"79\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"32\" target=\"74\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_abstract_bundle type=\"relation\" id=\"80\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"78\" target=\"32\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_bundle>\r\n" + 
				"    <rel_concrete_abstract type=\"relation\" relType=\"optional\" id=\"82\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"45\" target=\"78\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_abstract>\r\n" + 
				"    <abstract label=\"Providers\" type=\"abstract\" id=\"83\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"490\" y=\"390\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"mandatory\" id=\"84\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"83\" target=\"78\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"85\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"47\" target=\"83\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <abstract label=\"Internet\" type=\"abstract\" id=\"86\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"918\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"optional\" id=\"87\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"86\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"88\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"62\" target=\"86\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"requires\" id=\"89\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"6\" target=\"18\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_concrete>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"requires\" id=\"90\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"78\" target=\"86\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\r\n" + 
				"    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\r\n" + 
				"    <concrete label=\"Lighting\" type=\"concrete\" selected=\"false\" id=\"clon2\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"100\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Anti-theft Alarm\" type=\"concrete\" selected=\"false\" id=\"clon6\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"340\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Cellphone\" type=\"concrete\" selected=\"false\" id=\"clon15\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"180\" y=\"270\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Control Panel\" type=\"concrete\" selected=\"false\" id=\"clon18\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"260\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"HDTV42\" type=\"concrete\" selected=\"false\" id=\"clon22\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"370\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"PCPlayer\" type=\"concrete\" selected=\"false\" id=\"clon23\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"470\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"HDTV32\" type=\"concrete\" selected=\"false\" id=\"clon24\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"590\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Digital Media Server\" type=\"concrete\" selected=\"false\" id=\"clon35\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"660\" y=\"270\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Cache\" type=\"concrete\" selected=\"false\" id=\"clon45\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"620\" y=\"370\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Provider A\" type=\"concrete\" selected=\"false\" id=\"clon49\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"480\" y=\"540\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Provider B\" type=\"concrete\" selected=\"false\" id=\"clon51\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"550\" y=\"520\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Ethernet\" type=\"concrete\" selected=\"false\" id=\"clon54\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"810\" y=\"270\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"3G\" type=\"concrete\" selected=\"false\" id=\"clon55\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"930\" y=\"270\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Wifi-b\" type=\"concrete\" selected=\"false\" id=\"clon56\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"1060\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Wifi-n\" type=\"concrete\" selected=\"false\" id=\"clon57\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"1170\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"  </root>\r\n" + 
				"</mxGraphModel>";
	
		String expectedResult = "model  Auto_generated\n" + 
				"elements: \n" + 
				"	boolean HDTV42\n" + 
				"	boolean PCPlayer\n" + 
				"	boolean Cache\n" + 
				"	boolean HDTV32\n" + 
				"	boolean ControlSystem\n" + 
				"	boolean Provider_A\n" + 
				"	boolean MoviePlayers\n" + 
				"	boolean Provider_B\n" + 
				"	boolean Contents\n" + 
				"	boolean Ethernet\n" + 
				"	boolean 3G\n" + 
				"	boolean WifiMinusb\n" + 
				"	boolean VideoOnDemand\n" + 
				"	boolean Digital_Media_Server\n" + 
				"	boolean WifiMinusn\n" + 
				"	boolean Cellphone\n" + 
				"	boolean Control_Panel\n" + 
				"	boolean Smart_Home\n" + 
				"	boolean Lighting\n" + 
				"	boolean AntiMinustheft_Alarm\n" + 
				"	boolean Providers\n" + 
				"	boolean Internet\n" + 
				"relations:\n" + 
				"	r0:group(Providers,[Provider_A, Provider_B])[1,*]\n" + 
				"	r1:group(Contents,[Digital_Media_Server, VideoOnDemand])[1,*]\n" + 
				"	r2:group(ControlSystem,[Cellphone, Control_Panel])[1,*]\n" + 
				"	r3: coreElements(Smart_Home)\n" + 
				"	r4:group(Internet,[Ethernet, 3G, WifiMinusb, WifiMinusn])[1,*]\n" + 
				"	r5:group(MoviePlayers,[HDTV42, PCPlayer, HDTV32])[1,*]\n" + 
				"	r6:decomposition(Lighting,[Smart_Home])<1>\n" + 
				"	r7:decomposition(Smart_Home,[AntiMinustheft_Alarm])<0>\n" + 
				"	r8:decomposition(ControlSystem,[Smart_Home])<1>\n" + 
				"	r9:decomposition(Smart_Home,[MoviePlayers])<0>\n" + 
				"	r10:decomposition(Smart_Home,[Contents])<0>\n" + 
				"	r11:decomposition(VideoOnDemand,[Cache])<0>\n" + 
				"	r12:decomposition(Providers,[VideoOnDemand])<1>\n" + 
				"	r13:decomposition(Smart_Home,[Internet])<0>\n" + 
				"	r14: implies(AntiMinustheft_Alarm,Control_Panel)\n" + 
				"	r15: implies(VideoOnDemand,Internet)" + 
				"".trim();
		try {
			String variamosResult = varXmlToHlvlParser.parse(xml).trim();
			assertTrue(expectedResult.equals(variamosResult));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void InputStringSmallTest2()
	{
		String xml = "<mxGraphModel>\r\n" + 
				"  <root>\r\n" + 
				"    <mxCell id=\"0\"/>\r\n" + 
				"    <mxCell id=\"feature\" parent=\"0\"/>\r\n" + 
				"    <root label=\"Mobile Phone\" type=\"root\" id=\"1\">\r\n" + 
				"      <mxCell style=\"strokeWidth=3\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"290\" y=\"20\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </root>\r\n" + 
				"    <concrete label=\"Calls\" type=\"concrete\" selected=\"false\" id=\"13\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"230\" y=\"120\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_root type=\"relation\" relType=\"mandatory\" id=\"14\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"13\" target=\"1\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_root>\r\n" + 
				"    <concrete label=\"GPS\" type=\"concrete\" selected=\"false\" id=\"15\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"350\" y=\"120\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_root type=\"relation\" relType=\"optional\" id=\"16\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"15\" target=\"1\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_root>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"19\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"140\" y=\"180\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Basic\" type=\"concrete\" selected=\"false\" id=\"21\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"22\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"21\" target=\"19\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"Colour\" type=\"concrete\" selected=\"false\" id=\"23\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"110\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"24\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"23\" target=\"19\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"High Resolution\" type=\"concrete\" selected=\"false\" id=\"25\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"220\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"26\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"25\" target=\"19\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"32\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"500\" y=\"180\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Camera\" type=\"concrete\" selected=\"false\" id=\"34\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"420\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"35\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"34\" target=\"32\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"MP3\" type=\"concrete\" selected=\"false\" id=\"36\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"530\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"37\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"36\" target=\"32\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <abstract label=\"Screen\" type=\"abstract\" id=\"38\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"110\" y=\"120\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"39\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"38\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"40\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"19\" target=\"38\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <abstract label=\"Media\" type=\"abstract\" id=\"41\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"470\" y=\"120\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"42\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"32\" target=\"41\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"optional\" id=\"43\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"41\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"requires\" id=\"44\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"34\" target=\"25\">\r\n" + 
				"        <mxGeometry y=\"-7\" relative=\"1\" as=\"geometry\">\r\n" + 
				"          <mxPoint as=\"offset\"/>\r\n" + 
				"        </mxGeometry>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_concrete>\r\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"excludes\" id=\"45\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"15\" target=\"21\">\r\n" + 
				"        <mxGeometry x=\"0.0174\" y=\"-9\" relative=\"1\" as=\"geometry\">\r\n" + 
				"          <mxPoint as=\"offset\"/>\r\n" + 
				"        </mxGeometry>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_concrete>\r\n" + 
				"    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\r\n" + 
				"    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\r\n" + 
				"    <concrete label=\"Calls\" type=\"concrete\" selected=\"false\" id=\"clon13\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"270\" y=\"140\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"GPS\" type=\"concrete\" selected=\"false\" id=\"clon15\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"370\" y=\"120\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Basic\" type=\"concrete\" selected=\"false\" id=\"clon21\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"50\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Colour\" type=\"concrete\" selected=\"false\" id=\"clon23\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"180\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"High Resolution\" type=\"concrete\" selected=\"false\" id=\"clon25\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"270\" y=\"260\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Camera\" type=\"concrete\" selected=\"false\" id=\"clon34\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"490\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"MP3\" type=\"concrete\" selected=\"false\" id=\"clon36\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"550\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"  </root>\r\n" + 
				"</mxGraphModel>";
	
		String expectedResult = "model  Auto_generated\n" + 
				"elements: \n" + 
				"	boolean Mobile_Phone\n" + 
				"	boolean Colour\n" + 
				"	boolean Camera\n" + 
				"	boolean Calls\n" + 
				"	boolean High_Resolution\n" + 
				"	boolean MP3\n" + 
				"	boolean GPS\n" + 
				"	boolean Screen\n" + 
				"	boolean Media\n" + 
				"	boolean Basic\n" + 
				"relations:\n" + 
				"	r0: coreElements(Mobile_Phone)\n" + 
				"	r1:group(Screen,[Basic, Colour, High_Resolution])[1,*]\n" + 
				"	r2:group(Media,[Camera, MP3])[1,*]\n" + 
				"	r3:decomposition(Calls,[Mobile_Phone])<1>\n" + 
				"	r4:decomposition(Mobile_Phone,[GPS])<0>\n" + 
				"	r5:decomposition(Screen,[Mobile_Phone])<1>\n" + 
				"	r6:decomposition(Mobile_Phone,[Media])<0>\n" + 
				"	r7: implies(Camera,High_Resolution)\n" + 
				"	r8: mutex(Basic, GPS)";
		try {
			String variamosResult = varXmlToHlvlParser.parse(xml).trim();
			assertTrue(expectedResult.equals(variamosResult));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void InputStringBigTest2()
	{
		String xml = "<mxGraphModel>\r\n" + 
				"  <root>\r\n" + 
				"    <mxCell id=\"0\"/>\r\n" + 
				"    <mxCell id=\"feature\" parent=\"0\"/>\r\n" + 
				"    <root label=\"Computador\" type=\"root\" id=\"1\">\r\n" + 
				"      <mxCell style=\"strokeWidth=3\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"1105.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </root>\r\n" + 
				"    <concrete label=\"Planta de Poder\" type=\"concrete\" selected=\"false\" id=\"7\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"1781\" y=\"134\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_root type=\"relation\" relType=\"optional\" id=\"13\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"7\" target=\"1\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_root>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"14\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"153.5\" y=\"180\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Personal\" type=\"concrete\" selected=\"false\" id=\"16\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"170\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"17\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"16\" target=\"14\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"20\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"90\" y=\"320\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Portatil\" type=\"concrete\" selected=\"false\" id=\"22\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry y=\"370\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Mesa\" type=\"concrete\" selected=\"false\" id=\"23\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"110\" y=\"370\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"24\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"22\" target=\"20\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"25\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"23\" target=\"20\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"26\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"550.5\" y=\"180\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Dell\" type=\"concrete\" selected=\"false\" id=\"28\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"290\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Toshiba\" type=\"concrete\" selected=\"false\" id=\"29\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"400\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Lenovo\" type=\"concrete\" selected=\"false\" id=\"30\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"520\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Apple\" type=\"concrete\" selected=\"false\" id=\"31\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"630\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Clon\" type=\"concrete\" selected=\"false\" id=\"32\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"750\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"33\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"28\" target=\"26\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"34\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"29\" target=\"26\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"35\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"30\" target=\"26\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"36\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"31\" target=\"26\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"37\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"32\" target=\"26\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"38\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"664.5\" y=\"427.5\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Windows Server\" type=\"concrete\" selected=\"false\" id=\"45\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"337\" y=\"664.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Windows 10\" type=\"concrete\" selected=\"false\" id=\"46\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"448.5\" y=\"656\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"48\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"427\" y=\"594.5\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"50\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"45\" target=\"48\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"51\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"46\" target=\"48\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"52\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"677\" y=\"587.5\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Yosemite\" type=\"concrete\" selected=\"false\" id=\"53\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"577\" y=\"663\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"OS X Server\" type=\"concrete\" selected=\"false\" id=\"54\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"688.5\" y=\"656\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"55\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"53\" target=\"52\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"56\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"54\" target=\"52\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"58\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"898\" y=\"588.5\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"Fedora\" type=\"concrete\" selected=\"false\" id=\"60\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"808.5\" y=\"656\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"61\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"60\" target=\"58\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"Red Hat\" type=\"concrete\" selected=\"false\" id=\"62\">\r\n" + 
				"      <mxCell style=\"\" parent=\"feature\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"918.5\" y=\"647.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"63\">\r\n" + 
				"      <mxCell parent=\"feature\" source=\"62\" target=\"58\" edge=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"73\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"951.5\" y=\"338\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"AMD\" type=\"concrete\" selected=\"false\" id=\"74\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"931.5\" y=\"406.5\" width=\"33\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Intel\" type=\"concrete\" selected=\"false\" id=\"75\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"969.5\" y=\"406.5\" width=\"32\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"77\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"74\" target=\"73\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"78\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"75\" target=\"73\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"79\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1064.5\" y=\"398\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"4 GB\" type=\"concrete\" selected=\"false\" id=\"80\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"930.5\" y=\"500.5\" width=\"38\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"8 GB\" type=\"concrete\" selected=\"false\" id=\"81\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"985\" y=\"494\" width=\"39\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"32 GB\" type=\"concrete\" selected=\"false\" id=\"82\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1100\" y=\"494\" width=\"38\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"16 GB\" type=\"concrete\" selected=\"false\" id=\"83\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1045.5\" y=\"494\" width=\"38\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"84\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"80\" target=\"79\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"85\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"81\" target=\"79\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"86\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"83\" target=\"79\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"87\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"82\" target=\"79\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <concrete label=\"64 GB\" type=\"concrete\" selected=\"false\" id=\"89\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1154.5\" y=\"494\" width=\"46\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"90\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"89\" target=\"79\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"91\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1327\" y=\"394\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"500 GB\" type=\"concrete\" selected=\"false\" id=\"92\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1210.5\" y=\"495\" width=\"55\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"1 TB\" type=\"concrete\" selected=\"false\" id=\"93\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1276.5\" y=\"496\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"2 TB\" type=\"concrete\" selected=\"false\" id=\"94\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1319\" y=\"496\" width=\"41\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"5 TB\" type=\"concrete\" selected=\"false\" id=\"95\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1377\" y=\"494\" width=\"36\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"10 TB\" type=\"concrete\" selected=\"false\" id=\"96\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1426\" y=\"494\" width=\"40\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"97\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"92\" target=\"91\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"98\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"93\" target=\"91\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"99\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"94\" target=\"91\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"100\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"95\" target=\"91\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"101\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"96\" target=\"91\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"105\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1514.5\" y=\"397.5\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <abstract label=\"Tipo\" type=\"abstract\" id=\"106\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"123.5\" y=\"103\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"108\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"106\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <abstract label=\"Servidor\" type=\"abstract\" id=\"109\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"43.5\" y=\"243\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_bundle type=\"relation\" id=\"110\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"109\" target=\"14\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_bundle>\r\n" + 
				"    <abstract label=\"Marca\" type=\"abstract\" id=\"112\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"513.5\" y=\"100\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"113\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"112\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <abstract label=\"SO\" type=\"abstract\" id=\"115\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"756\" y=\"330\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"117\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"115\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <abstract label=\"Windows\" type=\"abstract\" id=\"118\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"491\" y=\"508.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_bundle type=\"relation\" id=\"119\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"118\" target=\"38\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_bundle>\r\n" + 
				"    <abstract label=\"Apple\" type=\"abstract\" id=\"121\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"641\" y=\"512\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_bundle type=\"relation\" id=\"122\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"121\" target=\"38\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_bundle>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"124\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"38\" target=\"115\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"125\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"26\" target=\"112\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"126\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"14\" target=\"106\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"127\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"20\" target=\"109\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"128\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"48\" target=\"118\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"129\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"52\" target=\"121\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <abstract label=\"Linux\" type=\"abstract\" id=\"130\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"771\" y=\"518.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_bundle type=\"relation\" id=\"131\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"130\" target=\"38\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_bundle>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"132\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"58\" target=\"130\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <abstract label=\"CPU\" type=\"abstract\" id=\"133\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1115\" y=\"157.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <abstract label=\"Procesador\" type=\"abstract\" id=\"139\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"925\" y=\"277.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"mandatory\" id=\"140\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"139\" target=\"133\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <abstract label=\"Memoria\" type=\"abstract\" id=\"141\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1051.5\" y=\"287.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"142\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"73\" target=\"139\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"143\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"79\" target=\"141\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"mandatory\" id=\"144\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"141\" target=\"133\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <abstract label=\"Disco\" type=\"abstract\" id=\"145\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1181.5\" y=\"294.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"mandatory\" id=\"146\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"145\" target=\"133\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"147\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"91\" target=\"145\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <abstract label=\"Tarjeta Grafica\" type=\"abstract\" id=\"148\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1301.5\" y=\"284.5\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"149\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"105\" target=\"148\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"optional\" id=\"150\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"148\" target=\"133\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <concrete label=\"ATI\" type=\"concrete\" selected=\"false\" id=\"151\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1482.5\" y=\"501\" width=\"30\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"NVIDIA\" type=\"concrete\" selected=\"false\" id=\"152\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1535\" y=\"484\" width=\"50\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"153\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"151\" target=\"105\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"154\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"152\" target=\"105\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"mandatory\" id=\"157\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"133\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <abstract label=\"Tecnologia\" type=\"abstract\" id=\"158\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1586\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <abstract label=\"Pantalla\" type=\"abstract\" id=\"159\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1551\" y=\"134\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_root type=\"relation\" relType=\"optional\" id=\"160\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"159\" target=\"1\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_root>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"mandatory\" id=\"161\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"158\" target=\"159\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <abstract label=\"Size\" type=\"abstract\" id=\"162\">\r\n" + 
				"      <mxCell style=\"strokeWidth=2\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1764\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </abstract>\r\n" + 
				"    <rel_abstract_abstract type=\"relation\" relType=\"mandatory\" id=\"163\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"162\" target=\"159\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_abstract>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"OR\" lowRange=\"1\" highRange=\"1\" id=\"164\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1608.5\" y=\"318.5\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"165\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"164\" target=\"158\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <concrete label=\"3D\" type=\"concrete\" selected=\"false\" id=\"166\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1578.5\" y=\"398.5\" width=\"31\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"4K\" type=\"concrete\" selected=\"false\" id=\"167\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1628.5\" y=\"388.5\" width=\"28\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"168\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"166\" target=\"164\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"169\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"167\" target=\"164\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <bundle label=\"bundle\" type=\"bundle\" bundleType=\"XOR\" lowRange=\"1\" highRange=\"1\" id=\"170\">\r\n" + 
				"      <mxCell style=\"shape=ellipse\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1803\" y=\"306\" width=\"35\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </bundle>\r\n" + 
				"    <concrete label=\"14 Pulgadas\" type=\"concrete\" selected=\"false\" id=\"171\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1680\" y=\"392\" width=\"84\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"17 Pulgadas\" type=\"concrete\" selected=\"false\" id=\"172\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1797\" y=\"388\" width=\"78\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"24 Pulgadas\" type=\"concrete\" selected=\"false\" id=\"173\">\r\n" + 
				"      <mxCell style=\"\" vertex=\"1\" parent=\"feature\">\r\n" + 
				"        <mxGeometry x=\"1897\" y=\"388\" width=\"81\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"174\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"171\" target=\"170\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"175\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"172\" target=\"170\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_concrete_bundle type=\"relation\" id=\"176\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"173\" target=\"170\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_bundle>\r\n" + 
				"    <rel_bundle_abstract type=\"relation\" id=\"177\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"170\" target=\"162\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_bundle_abstract>\r\n" + 
				"    <rel_concrete_abstract type=\"relation\" relType=\"requires\" id=\"181\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"45\" target=\"109\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_abstract>\r\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"requires\" id=\"182\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"46\" target=\"16\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_concrete>\r\n" + 
				"    <rel_abstract_concrete type=\"relation\" relType=\"requires\" id=\"183\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"159\" target=\"22\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_abstract_concrete>\r\n" + 
				"    <rel_concrete_abstract type=\"relation\" relType=\"requires\" id=\"184\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"62\" target=\"109\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_abstract>\r\n" + 
				"    <rel_concrete_abstract type=\"relation\" relType=\"requires\" id=\"185\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"54\" target=\"109\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_abstract>\r\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"requires\" id=\"186\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"60\" target=\"16\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_concrete>\r\n" + 
				"    <rel_concrete_concrete type=\"relation\" relType=\"requires\" id=\"187\">\r\n" + 
				"      <mxCell edge=\"1\" parent=\"feature\" source=\"53\" target=\"16\">\r\n" + 
				"        <mxGeometry relative=\"1\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </rel_concrete_concrete>\r\n" + 
				"    <mxCell id=\"component\" parent=\"0\" visible=\"0\"/>\r\n" + 
				"    <mxCell id=\"binding_feature_component\" parent=\"0\" visible=\"0\"/>\r\n" + 
				"    <concrete label=\"Planta de Poder\" type=\"concrete\" selected=\"false\" id=\"clon7\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"560\" y=\"100\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Personal\" type=\"concrete\" selected=\"false\" id=\"clon16\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"30\" y=\"230\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Portatil\" type=\"concrete\" selected=\"false\" id=\"clon22\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"80\" y=\"390\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Mesa\" type=\"concrete\" selected=\"false\" id=\"clon23\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"220\" y=\"380\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Dell\" type=\"concrete\" selected=\"false\" id=\"clon28\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"290\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Toshiba\" type=\"concrete\" selected=\"false\" id=\"clon29\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"400\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Lenovo\" type=\"concrete\" selected=\"false\" id=\"clon30\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"530\" y=\"250\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Apple\" type=\"concrete\" selected=\"false\" id=\"clon31\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"630\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Clon\" type=\"concrete\" selected=\"false\" id=\"clon32\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"750\" y=\"240\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Windows Server\" type=\"concrete\" selected=\"false\" id=\"clon45\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"660\" y=\"520\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Windows 10\" type=\"concrete\" selected=\"false\" id=\"clon46\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"770\" y=\"490\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Yosemite\" type=\"concrete\" selected=\"false\" id=\"clon53\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"830\" y=\"520\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"OS X Server\" type=\"concrete\" selected=\"false\" id=\"clon54\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"960\" y=\"530\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Fedora\" type=\"concrete\" selected=\"false\" id=\"clon60\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"1100\" y=\"530\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Red Hat\" type=\"concrete\" selected=\"false\" id=\"clon62\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" parent=\"binding_feature_component\" vertex=\"1\">\r\n" + 
				"        <mxGeometry x=\"1230\" y=\"520\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"AMD\" type=\"concrete\" selected=\"false\" id=\"clon74\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1520\" y=\"360\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"Intel\" type=\"concrete\" selected=\"false\" id=\"clon75\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1640\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"4 GB\" type=\"concrete\" selected=\"false\" id=\"clon80\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1670\" y=\"360\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"8 GB\" type=\"concrete\" selected=\"false\" id=\"clon81\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1790\" y=\"330\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"32 GB\" type=\"concrete\" selected=\"false\" id=\"clon82\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1900\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"16 GB\" type=\"concrete\" selected=\"false\" id=\"clon83\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1900\" y=\"340\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"64 GB\" type=\"concrete\" selected=\"false\" id=\"clon89\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1800\" y=\"500\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"500 GB\" type=\"concrete\" selected=\"false\" id=\"clon92\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1760\" y=\"350\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"1 TB\" type=\"concrete\" selected=\"false\" id=\"clon93\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1880\" y=\"320\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"2 TB\" type=\"concrete\" selected=\"false\" id=\"clon94\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1900\" y=\"370\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"5 TB\" type=\"concrete\" selected=\"false\" id=\"clon95\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1820\" y=\"380\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"10 TB\" type=\"concrete\" selected=\"false\" id=\"clon96\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1710\" y=\"500\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"ATI\" type=\"concrete\" selected=\"false\" id=\"clon151\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1630\" y=\"420\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"NVIDIA\" type=\"concrete\" selected=\"false\" id=\"clon152\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1680\" y=\"420\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"3D\" type=\"concrete\" selected=\"false\" id=\"clon166\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1680\" y=\"310\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"4K\" type=\"concrete\" selected=\"false\" id=\"clon167\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1800\" y=\"300\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"14 Pulgadas\" type=\"concrete\" selected=\"false\" id=\"clon171\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1440\" y=\"630\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"17 Pulgadas\" type=\"concrete\" selected=\"false\" id=\"clon172\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1580\" y=\"600\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"    <concrete label=\"24 Pulgadas\" type=\"concrete\" selected=\"false\" id=\"clon173\">\r\n" + 
				"      <mxCell style=\"fillColor=#DCDCDC;\" vertex=\"1\" parent=\"binding_feature_component\">\r\n" + 
				"        <mxGeometry x=\"1730\" y=\"600\" width=\"100\" height=\"35\" as=\"geometry\"/>\r\n" + 
				"      </mxCell>\r\n" + 
				"    </concrete>\r\n" + 
				"  </root>\r\n" + 
				"</mxGraphModel>";
	
		String expectedResult = "model  Auto_generated\n" + 
				"elements: \n" + 
				"	boolean Windows_Server\n" + 
				"	boolean 64_GB\n" + 
				"	boolean Windows_10\n" + 
				"	boolean ATI\n" + 
				"	boolean NVIDIA\n" + 
				"	boolean Marca\n" + 
				"	boolean Tecnologia\n" + 
				"	boolean SO\n" + 
				"	boolean Pantalla\n" + 
				"	boolean Windows\n" + 
				"	boolean 500_GB\n" + 
				"	boolean 1_TB\n" + 
				"	boolean 2_TB\n" + 
				"	boolean 5_TB\n" + 
				"	boolean 10_TB\n" + 
				"	boolean Yosemite\n" + 
				"	boolean OS_X_Server\n" + 
				"	boolean Personal\n" + 
				"	boolean Size\n" + 
				"	boolean Apple\n" + 
				"	boolean Computador\n" + 
				"	boolean 3D\n" + 
				"	boolean 4K\n" + 
				"	boolean Planta_de_Poder\n" + 
				"	boolean Fedora\n" + 
				"	boolean Red_Hat\n" + 
				"	boolean Portatil\n" + 
				"	boolean Mesa\n" + 
				"	boolean Dell\n" + 
				"	boolean Toshiba\n" + 
				"	boolean 14_Pulgadas\n" + 
				"	boolean 17_Pulgadas\n" + 
				"	boolean 24_Pulgadas\n" + 
				"	boolean Linux\n" + 
				"	boolean CPU\n" + 
				"	boolean Procesador\n" + 
				"	boolean Lenovo\n" + 
				"	boolean AMD\n" + 
				"	boolean Apple\n" + 
				"	boolean Intel\n" + 
				"	boolean Clon\n" + 
				"	boolean Memoria\n" + 
				"	boolean Disco\n" + 
				"	boolean Tarjeta_Grafica\n" + 
				"	boolean Tipo\n" + 
				"	boolean 4_GB\n" + 
				"	boolean 8_GB\n" + 
				"	boolean 32_GB\n" + 
				"	boolean Servidor\n" + 
				"	boolean 16_GB\n" + 
				"relations:\n" + 
				"	r0:group(Windows,[Windows_Server, Windows_10])[1,*]\n" + 
				"	r1:group(Disco,[500_GB, 1_TB, 2_TB, 5_TB, 10_TB])[1,*]\n" + 
				"	r2:group(Apple,[Yosemite, OS_X_Server])[1,*]\n" + 
				"	r3:group(Tipo,[Personal, Servidor])[1,*]\n" + 
				"	r4:group(Linux,[Fedora, Red_Hat])[1,*]\n" + 
				"	r5:group(Tecnologia,[3D, 4K])[1,*]\n" + 
				"	r6: coreElements(Computador)\n" + 
				"	r7:group(Servidor,[Portatil, Mesa])[1,*]\n" + 
				"	r8:group(Marca,[Dell, Toshiba, Lenovo, Apple, Clon])[1,*]\n" + 
				"	r9:group(Size,[14_Pulgadas, 17_Pulgadas, 24_Pulgadas])[1,*]\n" + 
				"	r10:group(Procesador,[AMD, Intel])[1,*]\n" + 
				"	r11:group(Memoria,[4_GB, 8_GB, 16_GB, 32_GB, 64_GB])[1,*]\n" + 
				"	r12:group(SO,[Windows, Apple, Linux])[1,*]\n" + 
				"	r13:group(Tarjeta_Grafica,[ATI, NVIDIA])[1,*]\n" + 
				"	r14:decomposition(Computador,[Planta_de_Poder])<0>\n" + 
				"	r15:decomposition(Tipo,[Computador])<1>\n" + 
				"	r16:decomposition(Marca,[Computador])<1>\n" + 
				"	r17:decomposition(SO,[Computador])<1>\n" + 
				"	r18:decomposition(Procesador,[CPU])<1>\n" + 
				"	r19:decomposition(Memoria,[CPU])<1>\n" + 
				"	r20:decomposition(Disco,[CPU])<1>\n" + 
				"	r21:decomposition(CPU,[Tarjeta_Grafica])<0>\n" + 
				"	r22:decomposition(CPU,[Computador])<1>\n" + 
				"	r23:decomposition(Computador,[Pantalla])<0>\n" + 
				"	r24:decomposition(Tecnologia,[Pantalla])<1>\n" + 
				"	r25:decomposition(Size,[Pantalla])<1>\n" + 
				"	r26: implies(Windows_Server,Servidor)\n" + 
				"	r27: implies(Windows_10,Personal)\n" + 
				"	r28: implies(Pantalla,Portatil)\n" + 
				"	r29: implies(Red_Hat,Servidor)\n" + 
				"	r30: implies(OS_X_Server,Servidor)\n" + 
				"	r31: implies(Fedora,Personal)\n" + 
				"	r32: implies(Yosemite,Personal)" + 
				"";
		try {
			String variamosResult = varXmlToHlvlParser.parse(xml).trim();
			assertTrue(expectedResult.equals(variamosResult));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void CommonTest2() 
	{

		String expectedResult = "model  commonTest2_generated\n" + 
				"elements: \n" + 
				"	boolean HDTV42\n" + 
				"	boolean PCPlayer\n" + 
				"	boolean Cache\n" + 
				"	boolean HDTV32\n" + 
				"	boolean ControlSystem\n" + 
				"	boolean Provider_A\n" + 
				"	boolean MoviePlayers\n" + 
				"	boolean Provider_B\n" + 
				"	boolean Contents\n" + 
				"	boolean Ethernet\n" + 
				"	boolean 3G\n" + 
				"	boolean WifiMinusb\n" + 
				"	boolean VideoOnDemand\n" + 
				"	boolean Digital_Media_Server\n" + 
				"	boolean WifiMinusn\n" + 
				"	boolean Cellphone\n" + 
				"	boolean Control_Panel\n" + 
				"	boolean Smart_Home\n" + 
				"	boolean Lighting\n" + 
				"	boolean AntiMinustheft_Alarm\n" + 
				"	boolean Providers\n" + 
				"	boolean Internet\n" + 
				"relations:\n" + 
				"	r0:group(Providers,[Provider_A, Provider_B])[1,*]\n" + 
				"	r1:group(Contents,[Digital_Media_Server, VideoOnDemand])[1,*]\n" + 
				"	r2:group(ControlSystem,[Cellphone, Control_Panel])[1,*]\n" + 
				"	r3: coreElements(Smart_Home)\n" + 
				"	r4:group(Internet,[Ethernet, 3G, WifiMinusb, WifiMinusn])[1,*]\n" + 
				"	r5:group(MoviePlayers,[HDTV42, PCPlayer, HDTV32])[1,*]\n" + 
				"	r6:decomposition(Lighting,[Smart_Home])<1>\n" + 
				"	r7:decomposition(Smart_Home,[AntiMinustheft_Alarm])<0>\n" + 
				"	r8:decomposition(ControlSystem,[Smart_Home])<1>\n" + 
				"	r9:decomposition(Smart_Home,[MoviePlayers])<0>\n" + 
				"	r10:decomposition(Smart_Home,[Contents])<0>\n" + 
				"	r11:decomposition(VideoOnDemand,[Cache])<0>\n" + 
				"	r12:decomposition(Providers,[VideoOnDemand])<1>\n" + 
				"	r13:decomposition(Smart_Home,[Internet])<0>\n" + 
				"	r14: implies(AntiMinustheft_Alarm,Control_Panel)\n" + 
				"	r15: implies(VideoOnDemand,Internet)" +
				"";
		ParsingParameters params = new ParsingParameters();
		params.setInputPath(COMMON_PATH_INPUT+"commonTest2");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("commonTest2");
		varXmlToHlvlParser.setParams(params);
		try {
			varXmlToHlvlParser.parse();
			assertTrue(expectedResult.equals(varXmlToHlvlParser.getHlvlCode().toString().trim()));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void SmallTest2() 
	{

		String expectedResult = "model  smallTest2_generated\n" + 
				"elements: \n" + 
				"	boolean Mobile_Phone\n" + 
				"	boolean Colour\n" + 
				"	boolean Camera\n" + 
				"	boolean Calls\n" + 
				"	boolean High_Resolution\n" + 
				"	boolean MP3\n" + 
				"	boolean GPS\n" + 
				"	boolean Screen\n" + 
				"	boolean Media\n" + 
				"	boolean Basic\n" + 
				"relations:\n" + 
				"	r0: coreElements(Mobile_Phone)\n" + 
				"	r1:group(Screen,[Basic, Colour, High_Resolution])[1,*]\n" + 
				"	r2:group(Media,[Camera, MP3])[1,*]\n" + 
				"	r3:decomposition(Calls,[Mobile_Phone])<1>\n" + 
				"	r4:decomposition(Mobile_Phone,[GPS])<0>\n" + 
				"	r5:decomposition(Screen,[Mobile_Phone])<1>\n" + 
				"	r6:decomposition(Mobile_Phone,[Media])<0>\n" + 
				"	r7: implies(Camera,High_Resolution)\n" + 
				"	r8: mutex(Basic, GPS)" + 
				"";
		ParsingParameters params = new ParsingParameters();
		params.setInputPath(COMMON_PATH_INPUT+"smallTest2");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("smallTest2");
		varXmlToHlvlParser.setParams(params);
		try {
			varXmlToHlvlParser.parse();
			assertTrue(expectedResult.equals(varXmlToHlvlParser.getHlvlCode().toString().trim()));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void BigTest2() 
	{

		String expectedResult = "model  bigTest2_generated\n" + 
				"elements: \n" + 
				"	boolean Windows_Server\n" + 
				"	boolean 64_GB\n" + 
				"	boolean Windows_10\n" + 
				"	boolean ATI\n" + 
				"	boolean NVIDIA\n" + 
				"	boolean Marca\n" + 
				"	boolean Tecnologia\n" + 
				"	boolean SO\n" + 
				"	boolean Pantalla\n" + 
				"	boolean Windows\n" + 
				"	boolean 500_GB\n" + 
				"	boolean 1_TB\n" + 
				"	boolean 2_TB\n" + 
				"	boolean 5_TB\n" + 
				"	boolean 10_TB\n" + 
				"	boolean Yosemite\n" + 
				"	boolean OS_X_Server\n" + 
				"	boolean Personal\n" + 
				"	boolean Size\n" + 
				"	boolean Apple\n" + 
				"	boolean Computador\n" + 
				"	boolean 3D\n" + 
				"	boolean 4K\n" + 
				"	boolean Planta_de_Poder\n" + 
				"	boolean Fedora\n" + 
				"	boolean Red_Hat\n" + 
				"	boolean Portatil\n" + 
				"	boolean Mesa\n" + 
				"	boolean Dell\n" + 
				"	boolean Toshiba\n" + 
				"	boolean 14_Pulgadas\n" + 
				"	boolean 17_Pulgadas\n" + 
				"	boolean 24_Pulgadas\n" + 
				"	boolean Linux\n" + 
				"	boolean CPU\n" + 
				"	boolean Procesador\n" + 
				"	boolean Lenovo\n" + 
				"	boolean AMD\n" + 
				"	boolean Apple\n" + 
				"	boolean Intel\n" + 
				"	boolean Clon\n" + 
				"	boolean Memoria\n" + 
				"	boolean Disco\n" + 
				"	boolean Tarjeta_Grafica\n" + 
				"	boolean Tipo\n" + 
				"	boolean 4_GB\n" + 
				"	boolean 8_GB\n" + 
				"	boolean 32_GB\n" + 
				"	boolean Servidor\n" + 
				"	boolean 16_GB\n" + 
				"relations:\n" + 
				"	r0:group(Windows,[Windows_Server, Windows_10])[1,*]\n" + 
				"	r1:group(Disco,[500_GB, 1_TB, 2_TB, 5_TB, 10_TB])[1,*]\n" + 
				"	r2:group(Apple,[Yosemite, OS_X_Server])[1,*]\n" + 
				"	r3:group(Tipo,[Personal, Servidor])[1,*]\n" + 
				"	r4:group(Linux,[Fedora, Red_Hat])[1,*]\n" + 
				"	r5:group(Tecnologia,[3D, 4K])[1,*]\n" + 
				"	r6: coreElements(Computador)\n" + 
				"	r7:group(Servidor,[Portatil, Mesa])[1,*]\n" + 
				"	r8:group(Marca,[Dell, Toshiba, Lenovo, Apple, Clon])[1,*]\n" + 
				"	r9:group(Size,[14_Pulgadas, 17_Pulgadas, 24_Pulgadas])[1,*]\n" + 
				"	r10:group(Procesador,[AMD, Intel])[1,*]\n" + 
				"	r11:group(Memoria,[4_GB, 8_GB, 16_GB, 32_GB, 64_GB])[1,*]\n" + 
				"	r12:group(SO,[Windows, Apple, Linux])[1,*]\n" + 
				"	r13:group(Tarjeta_Grafica,[ATI, NVIDIA])[1,*]\n" + 
				"	r14:decomposition(Computador,[Planta_de_Poder])<0>\n" + 
				"	r15:decomposition(Tipo,[Computador])<1>\n" + 
				"	r16:decomposition(Marca,[Computador])<1>\n" + 
				"	r17:decomposition(SO,[Computador])<1>\n" + 
				"	r18:decomposition(Procesador,[CPU])<1>\n" + 
				"	r19:decomposition(Memoria,[CPU])<1>\n" + 
				"	r20:decomposition(Disco,[CPU])<1>\n" + 
				"	r21:decomposition(CPU,[Tarjeta_Grafica])<0>\n" + 
				"	r22:decomposition(CPU,[Computador])<1>\n" + 
				"	r23:decomposition(Computador,[Pantalla])<0>\n" + 
				"	r24:decomposition(Tecnologia,[Pantalla])<1>\n" + 
				"	r25:decomposition(Size,[Pantalla])<1>\n" + 
				"	r26: implies(Windows_Server,Servidor)\n" + 
				"	r27: implies(Windows_10,Personal)\n" + 
				"	r28: implies(Pantalla,Portatil)\n" + 
				"	r29: implies(Red_Hat,Servidor)\n" + 
				"	r30: implies(OS_X_Server,Servidor)\n" + 
				"	r31: implies(Fedora,Personal)\n" + 
				"	r32: implies(Yosemite,Personal)" + 
				"";
		ParsingParameters params = new ParsingParameters();
		params.setInputPath(COMMON_PATH_INPUT+"bigTest2");
		params.setOutputPath(COMMON_PATH_OUTPUT);
		params.setTargetName("bigTest2");
		varXmlToHlvlParser.setParams(params);
		try {
			varXmlToHlvlParser.parse();
			assertTrue(expectedResult.equals(varXmlToHlvlParser.getHlvlCode().toString().trim()));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}


}
