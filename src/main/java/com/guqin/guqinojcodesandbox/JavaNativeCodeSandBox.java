package com.guqin.guqinojcodesandbox;


import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.StrUtil;
import cn.hutool.dfa.FoundWord;
import cn.hutool.dfa.WordTree;
import com.guqin.guqinojcodesandbox.model.ExecuteCodeRequest;
import com.guqin.guqinojcodesandbox.model.ExecuteCodeResponse;
import com.guqin.guqinojcodesandbox.model.ExecuteMessage;
import com.guqin.guqinojcodesandbox.model.JudgeInfo;
import com.guqin.guqinojcodesandbox.security.DefaultSecurityManager;
import com.guqin.guqinojcodesandbox.utils.ProcessUtil;
import sun.misc.Unsafe;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 代码沙箱接口
 * @author 顾琴
 */
public class JavaNativeCodeSandBox extends JavaCodeSandBoxTemplate{

    private static final String GLOBAL_CODE_DIR_NAME = "tmpCode";

    private static final String GLOBAL_JAVA_CLASS_NAME = "Main.java";


    private static final long TIME_OUT = 5000L;

    private static final List<String> BLACK_LIST = Arrays.asList("Files","exec");

    private static final WordTree WORD_TREE;
    private static final String SECURITY_MANAGER_CLASS_NAME = "MySecurityManager";
    private static final String SECURITY_MANAGER_PATH = "D:\\code\\huiapi-backend\\guqinoj-code-sandbox\\src\\main\\resources\\security";

    static{
        //初始化字典树
        WORD_TREE = new WordTree();
        WORD_TREE.addWords(BLACK_LIST);
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
