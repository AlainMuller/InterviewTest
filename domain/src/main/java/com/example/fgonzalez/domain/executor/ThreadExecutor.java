/*******************************************************************************
 * Copyright (c) 2017 Francisco Gonzalez-Armijo Riádigos
 * Based on Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.example.fgonzalez.domain.executor;

import rx.Scheduler;

/**
 * Default Executor interface that provides its Scheduler.
 *
 * This is a contract which establishes the {@link Scheduler} that must be applied to an {@link rx.Observable}
 * either on its {@link rx.Observable#observeOn(Scheduler)} or {@link rx.Observable#subscribeOn(Scheduler)} method.
 */
public interface ThreadExecutor {

    /**
     * Provides a specific {@link Scheduler}.
     *
     * @return The Scheduler
     */
    Scheduler getScheduler();
}