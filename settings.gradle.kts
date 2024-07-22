pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.develocity") version "3.17.4"
}

develocity {
    server = "http://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
        publishing { true}
    }
}
rootProject.name="project"
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
include (":layer_0:module_0_1")
include (":layer_0:module_0_2")
include (":layer_0:module_0_3")
include (":layer_0:module_0_4")
include (":layer_0:module_0_5")
include (":layer_0:module_0_6")
include (":layer_0:module_0_7")
include (":layer_0:module_0_8")
include (":layer_0:module_0_9")
include (":layer_0:module_0_10")
include (":layer_0:module_0_11")
include (":layer_0:module_0_12")
include (":layer_0:module_0_13")
include (":layer_0:module_0_14")
include (":layer_0:module_0_15")
include (":layer_0:module_0_16")
include (":layer_0:module_0_17")
include (":layer_0:module_0_18")
include (":layer_0:module_0_19")
include (":layer_0:module_0_20")
include (":layer_0:module_0_21")
include (":layer_0:module_0_22")
include (":layer_0:module_0_23")
include (":layer_1:module_1_24")
include (":layer_1:module_1_25")
include (":layer_1:module_1_26")
include (":layer_1:module_1_27")
include (":layer_1:module_1_28")
include (":layer_1:module_1_29")
include (":layer_1:module_1_30")
include (":layer_1:module_1_31")
include (":layer_1:module_1_32")
include (":layer_1:module_1_33")
include (":layer_1:module_1_34")
include (":layer_1:module_1_35")
include (":layer_1:module_1_36")
include (":layer_1:module_1_37")
include (":layer_1:module_1_38")
include (":layer_1:module_1_39")
include (":layer_1:module_1_40")
include (":layer_1:module_1_41")
include (":layer_1:module_1_42")
include (":layer_1:module_1_43")
include (":layer_1:module_1_44")
include (":layer_1:module_1_45")
include (":layer_1:module_1_46")
include (":layer_1:module_1_47")
include (":layer_1:module_1_48")
include (":layer_1:module_1_49")
include (":layer_1:module_1_50")
include (":layer_1:module_1_51")
include (":layer_1:module_1_52")
include (":layer_1:module_1_53")
include (":layer_1:module_1_54")
include (":layer_1:module_1_55")
include (":layer_1:module_1_56")
include (":layer_1:module_1_57")
include (":layer_1:module_1_58")
include (":layer_2:module_2_59")
include (":layer_2:module_2_60")
include (":layer_2:module_2_61")
include (":layer_2:module_2_62")
include (":layer_2:module_2_63")
include (":layer_2:module_2_64")
include (":layer_2:module_2_65")
include (":layer_2:module_2_66")
include (":layer_2:module_2_67")
include (":layer_2:module_2_68")
include (":layer_2:module_2_69")
include (":layer_2:module_2_70")
include (":layer_2:module_2_71")
include (":layer_2:module_2_72")
include (":layer_2:module_2_73")
include (":layer_2:module_2_74")
include (":layer_2:module_2_75")
include (":layer_2:module_2_76")
include (":layer_2:module_2_77")
include (":layer_2:module_2_78")
include (":layer_2:module_2_79")
include (":layer_2:module_2_80")
include (":layer_2:module_2_81")
include (":layer_2:module_2_82")
include (":layer_2:module_2_83")
include (":layer_2:module_2_84")
include (":layer_2:module_2_85")
include (":layer_2:module_2_86")
include (":layer_2:module_2_87")
include (":layer_2:module_2_88")
include (":layer_2:module_2_89")
include (":layer_2:module_2_90")
include (":layer_2:module_2_91")
include (":layer_2:module_2_92")
include (":layer_2:module_2_93")
include (":layer_2:module_2_94")
include (":layer_2:module_2_95")
include (":layer_2:module_2_96")
include (":layer_2:module_2_97")
include (":layer_2:module_2_98")
include (":layer_2:module_2_99")
include (":layer_2:module_2_100")
include (":layer_2:module_2_101")
include (":layer_2:module_2_102")
include (":layer_2:module_2_103")
include (":layer_2:module_2_104")
include (":layer_2:module_2_105")
include (":layer_2:module_2_106")
include (":layer_2:module_2_107")
include (":layer_2:module_2_108")
include (":layer_2:module_2_109")
include (":layer_2:module_2_110")
include (":layer_2:module_2_111")
include (":layer_2:module_2_112")
include (":layer_2:module_2_113")
include (":layer_2:module_2_114")
include (":layer_2:module_2_115")
include (":layer_2:module_2_116")
include (":layer_2:module_2_117")
include (":layer_2:module_2_118")
include (":layer_2:module_2_119")
include (":layer_2:module_2_120")
include (":layer_2:module_2_121")
include (":layer_2:module_2_122")
include (":layer_2:module_2_123")
include (":layer_2:module_2_124")
include (":layer_2:module_2_125")
include (":layer_2:module_2_126")
include (":layer_2:module_2_127")
include (":layer_2:module_2_128")
include (":layer_2:module_2_129")
include (":layer_3:module_3_130")
include (":layer_4:module_4_131")
include (":layer_4:module_4_132")
include (":layer_4:module_4_133")
include (":layer_4:module_4_134")
include (":layer_4:module_4_135")
include (":layer_4:module_4_136")
include (":layer_4:module_4_137")
include (":layer_4:module_4_138")
include (":layer_4:module_4_139")
include (":layer_4:module_4_140")
include (":layer_4:module_4_141")
include (":layer_4:module_4_142")
include (":layer_4:module_4_143")
include (":layer_4:module_4_144")
include (":layer_4:module_4_145")
include (":layer_4:module_4_146")
include (":layer_4:module_4_147")
include (":layer_4:module_4_148")
include (":layer_4:module_4_149")
include (":layer_4:module_4_150")
include (":layer_4:module_4_151")
include (":layer_4:module_4_152")
include (":layer_4:module_4_153")
include (":layer_4:module_4_154")
include (":layer_4:module_4_155")
include (":layer_4:module_4_156")
include (":layer_4:module_4_157")
include (":layer_4:module_4_158")
include (":layer_4:module_4_159")
include (":layer_4:module_4_160")
include (":layer_4:module_4_161")
include (":layer_4:module_4_162")
include (":layer_4:module_4_163")
include (":layer_4:module_4_164")
include (":layer_4:module_4_165")
include (":layer_4:module_4_166")
include (":layer_4:module_4_167")
include (":layer_4:module_4_168")
include (":layer_4:module_4_169")
include (":layer_4:module_4_170")
include (":layer_4:module_4_171")
include (":layer_4:module_4_172")
include (":layer_4:module_4_173")
include (":layer_4:module_4_174")
include (":layer_4:module_4_175")
include (":layer_4:module_4_176")
include (":layer_4:module_4_177")
include (":layer_4:module_4_178")
include (":layer_4:module_4_179")
include (":layer_4:module_4_180")
include (":layer_4:module_4_181")
include (":layer_4:module_4_182")
include (":layer_4:module_4_183")
include (":layer_4:module_4_184")
include (":layer_4:module_4_185")
include (":layer_4:module_4_186")
include (":layer_4:module_4_187")
include (":layer_4:module_4_188")
include (":layer_4:module_4_189")
include (":layer_4:module_4_190")
include (":layer_4:module_4_191")
include (":layer_4:module_4_192")
include (":layer_5:module_5_193")
include (":layer_5:module_5_194")
include (":layer_5:module_5_195")
include (":layer_5:module_5_196")
include (":layer_5:module_5_197")
include (":layer_5:module_5_198")
include (":layer_5:module_5_199")
include (":layer_5:module_5_200")
include (":layer_5:module_5_201")
include (":layer_5:module_5_202")
include (":layer_5:module_5_203")
include (":layer_5:module_5_204")
include (":layer_5:module_5_205")
include (":layer_5:module_5_206")
include (":layer_5:module_5_207")
include (":layer_5:module_5_208")
include (":layer_5:module_5_209")
include (":layer_5:module_5_210")
include (":layer_5:module_5_211")
include (":layer_5:module_5_212")
include (":layer_5:module_5_213")
include (":layer_5:module_5_214")
include (":layer_5:module_5_215")
include (":layer_5:module_5_216")
include (":layer_5:module_5_217")
include (":layer_5:module_5_218")
include (":layer_5:module_5_219")
include (":layer_5:module_5_220")
include (":layer_5:module_5_221")
include (":layer_5:module_5_222")
include (":layer_5:module_5_223")
include (":layer_6:module_6_224")
include (":layer_6:module_6_225")
include (":layer_6:module_6_226")
include (":layer_6:module_6_227")
include (":layer_6:module_6_228")
include (":layer_6:module_6_229")
include (":layer_6:module_6_230")
include (":layer_6:module_6_231")
include (":layer_6:module_6_232")
include (":layer_6:module_6_233")
include (":layer_6:module_6_234")
include (":layer_6:module_6_235")
include (":layer_6:module_6_236")
include (":layer_6:module_6_237")
include (":layer_6:module_6_238")
include (":layer_6:module_6_239")
include (":layer_6:module_6_240")
include (":layer_6:module_6_241")
include (":layer_6:module_6_242")
include (":layer_6:module_6_243")
include (":layer_6:module_6_244")
include (":layer_7:module_7_245")
include (":layer_7:module_7_246")
include (":layer_7:module_7_247")
include (":layer_7:module_7_248")
include (":layer_7:module_7_249")
include (":layer_7:module_7_250")
include (":layer_7:module_7_251")
include (":layer_7:module_7_252")
include (":layer_7:module_7_253")
include (":layer_7:module_7_254")
include (":layer_7:module_7_255")
include (":layer_7:module_7_256")
include (":layer_7:module_7_257")
include (":layer_7:module_7_258")
include (":layer_7:module_7_259")
include (":layer_8:module_8_260")
