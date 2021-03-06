/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.codeInspection.reference;

import com.intellij.openapi.module.Module;
import org.jetbrains.annotations.NotNull;

/**
 * A node in the reference graph corresponding to a module.
 *
 * @author anna
 * @see RefManager#getRefModule
 */
public interface RefModule extends RefEntity {
  /**
   * Returns the module to which the node corresponds.
   *
   * @return the module for the node.
   */
  @NotNull Module getModule();
}
