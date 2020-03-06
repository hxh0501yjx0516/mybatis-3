/**
 * Copyright 2009-2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.logging;

/**
 * @author Clinton Begin
 * 这里mybatis自己定义的日志接口
 * 目的：兼容多种日志框架
 * 描述：级别越低，日志量越大
 */
public interface Log {

  boolean isDebugEnabled();

  boolean isTraceEnabled();

  void error(String s, Throwable e);

  /*
  级别高于warn,只虽然发生错误，也不影响系统运行
   */
  void error(String s);

  /*
  开发过程中打印 一些运行日志
   */
  void debug(String s);

  /*
  较低级别，一般不用
   */
  void trace(String s);

  /*
  级别高于 info, debug
    可能会出现潜在的错误，给程序员一些提示
   */
  void warn(String s);

}
